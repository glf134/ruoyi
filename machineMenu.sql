-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('虚拟机资源', '2000', '1', '/datasync/machine', 'C', '0', 'datasync:machine:view', '#', 'admin', sysdate(), '', null, '虚拟机资源菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('虚拟机资源查询', @parentId, '1',  '#',  'F', '0', 'datasync:machine:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('虚拟机资源新增', @parentId, '2',  '#',  'F', '0', 'datasync:machine:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('虚拟机资源修改', @parentId, '3',  '#',  'F', '0', 'datasync:machine:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('虚拟机资源删除', @parentId, '4',  '#',  'F', '0', 'datasync:machine:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('虚拟机资源导出', @parentId, '5',  '#',  'F', '0', 'datasync:machine:export',       '#', 'admin', sysdate(), '', null, '');
