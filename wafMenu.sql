-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('Web应用防护系统（WAF）', '2000', '1', '/datasync/waf', 'C', '0', 'datasync:waf:view', '#', 'admin', sysdate(), '', null, 'Web应用防护系统（WAF）菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('Web应用防护系统（WAF）查询', @parentId, '1',  '#',  'F', '0', 'datasync:waf:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('Web应用防护系统（WAF）新增', @parentId, '2',  '#',  'F', '0', 'datasync:waf:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('Web应用防护系统（WAF）修改', @parentId, '3',  '#',  'F', '0', 'datasync:waf:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('Web应用防护系统（WAF）删除', @parentId, '4',  '#',  'F', '0', 'datasync:waf:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('Web应用防护系统（WAF）导出', @parentId, '5',  '#',  'F', '0', 'datasync:waf:export',       '#', 'admin', sysdate(), '', null, '');
