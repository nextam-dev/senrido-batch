/**
 * 
 */
package jp.co.senrido.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jp.co.senrido.batch.tasklet.MainTasklet;

/**
 * @author takam
 *
 */
@Configuration // Bean 定義クラスであることを示すアノテーション
@EnableBatchProcessing // Spring Batch を有効にする
public class BatchConfig {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	@Autowired
	private MainTasklet tasklet;

	@Bean
	public Step step() {
		// System.out.println("step1 メソッドを実行");
		return stepBuilderFactory.get("step") // 任意のステップ名を指定
				.tasklet(tasklet)
				.build();
	}
	
	@Bean
	public Job job() {
		// System.out.println("job メソッドを実行");
		return jobBuilderFactory.get("job") // 一意となる任意のジョブ名を指定
				.incrementer(new RunIdIncrementer())
				.listener(listener())
				.start(step()) // 実行する Step を指定
				.build();
	}

	@Bean
	public JobExecutionListener listener() {
		return new JobListener();
	}
}
