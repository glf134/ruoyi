-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('虚拟专用网设备（VPN）', '2000', '1', '/datasync/vpn', 'C', '0', 'datasync:vpn:view', '#', 'admin', sysdate(), '', null, '虚拟专用网设备（VPN）菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('虚拟专用网设备（VPN）查询', @parentId, '1',  '#',  'F', '0', 'datasync:vpn:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('虚拟专用网设备（VPN）新增', @parentId, '2',  '#',  'F', '0', 'datasync:vpn:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('虚拟专用网设备（VPN）修改', @parentId, '3',  '#',  'F', '0', 'datasync:vpn:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('虚拟专用网设备（VPN）删除', @parentId, '4',  '#',  'F', '0', 'datasync:vpn:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('虚拟专用网设备（VPN）导出', @parentId, '5',  '#',  'F', '0', 'datasync:vpn:export',       '#', 'admin', sysdate(), '', null, '');
