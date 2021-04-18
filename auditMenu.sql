-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('运维审计设备', '2000', '1', '/datasync/audit', 'C', '0', 'datasync:audit:view', '#', 'admin', sysdate(), '', null, '运维审计设备菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('运维审计设备查询', @parentId, '1',  '#',  'F', '0', 'datasync:audit:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('运维审计设备新增', @parentId, '2',  '#',  'F', '0', 'datasync:audit:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('运维审计设备修改', @parentId, '3',  '#',  'F', '0', 'datasync:audit:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('运维审计设备删除', @parentId, '4',  '#',  'F', '0', 'datasync:audit:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('运维审计设备导出', @parentId, '5',  '#',  'F', '0', 'datasync:audit:export',       '#', 'admin', sysdate(), '', null, '');
