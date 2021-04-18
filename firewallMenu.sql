-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('防火墙', '2000', '1', '/datasync/firewall', 'C', '0', 'datasync:firewall:view', '#', 'admin', sysdate(), '', null, '防火墙菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('防火墙查询', @parentId, '1',  '#',  'F', '0', 'datasync:firewall:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('防火墙新增', @parentId, '2',  '#',  'F', '0', 'datasync:firewall:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('防火墙修改', @parentId, '3',  '#',  'F', '0', 'datasync:firewall:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('防火墙删除', @parentId, '4',  '#',  'F', '0', 'datasync:firewall:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('防火墙导出', @parentId, '5',  '#',  'F', '0', 'datasync:firewall:export',       '#', 'admin', sysdate(), '', null, '');
