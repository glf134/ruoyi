-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('普通空调', '2000', '1', '/datasync/condition', 'C', '0', 'datasync:condition:view', '#', 'admin', sysdate(), '', null, '普通空调菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('普通空调查询', @parentId, '1',  '#',  'F', '0', 'datasync:condition:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('普通空调新增', @parentId, '2',  '#',  'F', '0', 'datasync:condition:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('普通空调修改', @parentId, '3',  '#',  'F', '0', 'datasync:condition:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('普通空调删除', @parentId, '4',  '#',  'F', '0', 'datasync:condition:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('普通空调导出', @parentId, '5',  '#',  'F', '0', 'datasync:condition:export',       '#', 'admin', sysdate(), '', null, '');
