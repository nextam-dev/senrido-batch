select
  /*%expand*/*
from
  t_visit
where
  del_flg = false
order by
  visit_date desc
