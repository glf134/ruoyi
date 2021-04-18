-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('入侵报警系统', '2000', '1', '/datasync/alarm', 'C', '0', 'datasync:alarm:view', '#', 'admin', sysdate(), '', null, '入侵报警系统菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('入侵报警系统查询', @parentId, '1',  '#',  'F', '0', 'datasync:alarm:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('入侵报警系统新增', @parentId, '2',  '#',  'F', '0', 'datasync:alarm:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('入侵报警系统修改', @parentId, '3',  '#',  'F', '0', 'datasync:alarm:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('入侵报警系统删除', @parentId, '4',  '#',  'F', '0', 'datasync:alarm:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('入侵报警系统导出', @parentId, '5',  '#',  'F', '0', 'datasync:alarm:export',       '#', 'admin', sysdate(), '', null, '');
