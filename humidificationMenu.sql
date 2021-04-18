-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('加湿系统', '2000', '1', '/datasync/humidification', 'C', '0', 'datasync:humidification:view', '#', 'admin', sysdate(), '', null, '加湿系统菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('加湿系统查询', @parentId, '1',  '#',  'F', '0', 'datasync:humidification:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('加湿系统新增', @parentId, '2',  '#',  'F', '0', 'datasync:humidification:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('加湿系统修改', @parentId, '3',  '#',  'F', '0', 'datasync:humidification:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('加湿系统删除', @parentId, '4',  '#',  'F', '0', 'datasync:humidification:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('加湿系统导出', @parentId, '5',  '#',  'F', '0', 'datasync:humidification:export',       '#', 'admin', sysdate(), '', null, '');
