select
  /*%expand*/*
from
  t_glare
where
  id = /* id */0
and
  visit_date < /* visitDate */'2000-01-01'
order by
  visit_date desc