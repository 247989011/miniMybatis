SELECT * FROM users
WHERE 1=1
<#if users.username ?exists >
  AND username ='${users.username}'
</#if>
<#if users.name ?exists >
  AND name ='${users.name}'
</#if>
<#if users.userPhone ?exists >
  AND user_phone =:users.userPhone
</#if>
LIMIT
:page
,
:rows
