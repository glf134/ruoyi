-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('入侵检测与防御设备（IDS/IPS）', '2000', '1', '/datasync/ips', 'C', '0', 'datasync:ips:view', '#', 'admin', sysdate(), '', null, '入侵检测与防御设备（IDS/IPS）菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('入侵检测与防御设备（IDS/IPS）查询', @parentId, '1',  '#',  'F', '0', 'datasync:ips:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('入侵检测与防御设备（IDS/IPS）新增', @parentId, '2',  '#',  'F', '0', 'datasync:ips:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('入侵检测与防御设备（IDS/IPS）修改', @parentId, '3',  '#',  'F', '0', 'datasync:ips:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('入侵检测与防御设备（IDS/IPS）删除', @parentId, '4',  '#',  'F', '0', 'datasync:ips:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('入侵检测与防御设备（IDS/IPS）导出', @parentId, '5',  '#',  'F', '0', 'datasync:ips:export',       '#', 'admin', sysdate(), '', null, '');
