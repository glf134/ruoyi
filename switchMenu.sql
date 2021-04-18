-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('光纤交换机', '2000', '1', '/datasync/switch', 'C', '0', 'datasync:switch:view', '#', 'admin', sysdate(), '', null, '光纤交换机菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('光纤交换机查询', @parentId, '1',  '#',  'F', '0', 'datasync:switch:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('光纤交换机新增', @parentId, '2',  '#',  'F', '0', 'datasync:switch:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('光纤交换机修改', @parentId, '3',  '#',  'F', '0', 'datasync:switch:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('光纤交换机删除', @parentId, '4',  '#',  'F', '0', 'datasync:switch:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('光纤交换机导出', @parentId, '5',  '#',  'F', '0', 'datasync:switch:export',       '#', 'admin', sysdate(), '', null, '');
