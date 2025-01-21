package jp.co.senrido.batch.tasklet;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jp.co.senrido.batch.service.SuperSaasService;

/**
 * データ連携タスクレット
 * 
 * @author takam
 *
 */
@Component
public class MainTasklet implements Tasklet {
	
	private LocalDateTime sysdate;
	
	@Autowired
	private SuperSaasService superSaasService;
	
	static Logger logger = LoggerFactory.getLogger(MainTasklet.class);

	@Override
	@Transactional(rollbackFor = Throwable.class)
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("★★★★★★★★★ MainTasklet execute ★★★★★★★★★"); // メッセージを出力
		logger.info("MainTasklet start");
		
		sysdate = LocalDateTime.now();
	
		try {
			// TODO ここに処理を記載する。
			superSaasService.range();
			superSaasService.changes();

		} catch (Throwable th) {
			th.printStackTrace();
			throw new Exception(th.getMessage());
		}
		
		logger.info("MainTasklet end");
	    return RepeatStatus.FINISHED; // 処理が終了したことを示す値を返す
	}
}
