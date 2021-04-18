-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('波分复用设备', '2000', '1', '/datasync/wdm', 'C', '0', 'datasync:wdm:view', '#', 'admin', sysdate(), '', null, '波分复用设备菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('波分复用设备查询', @parentId, '1',  '#',  'F', '0', 'datasync:wdm:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('波分复用设备新增', @parentId, '2',  '#',  'F', '0', 'datasync:wdm:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('波分复用设备修改', @parentId, '3',  '#',  'F', '0', 'datasync:wdm:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('波分复用设备删除', @parentId, '4',  '#',  'F', '0', 'datasync:wdm:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('波分复用设备导出', @parentId, '5',  '#',  'F', '0', 'datasync:wdm:export',       '#', 'admin', sysdate(), '', null, '');
