-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('防病毒网关(AVE)', '2000', '1', '/datasync/ave', 'C', '0', 'datasync:ave:view', '#', 'admin', sysdate(), '', null, '防病毒网关(AVE)菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('防病毒网关(AVE)查询', @parentId, '1',  '#',  'F', '0', 'datasync:ave:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('防病毒网关(AVE)新增', @parentId, '2',  '#',  'F', '0', 'datasync:ave:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('防病毒网关(AVE)修改', @parentId, '3',  '#',  'F', '0', 'datasync:ave:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('防病毒网关(AVE)删除', @parentId, '4',  '#',  'F', '0', 'datasync:ave:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('防病毒网关(AVE)导出', @parentId, '5',  '#',  'F', '0', 'datasync:ave:export',       '#', 'admin', sysdate(), '', null, '');
