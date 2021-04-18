-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络线路关联关系', '2000', '1', '/datasync/relation', 'C', '0', 'datasync:relation:view', '#', 'admin', sysdate(), '', null, '网络线路关联关系菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络线路关联关系查询', @parentId, '1',  '#',  'F', '0', 'datasync:relation:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络线路关联关系新增', @parentId, '2',  '#',  'F', '0', 'datasync:relation:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络线路关联关系修改', @parentId, '3',  '#',  'F', '0', 'datasync:relation:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络线路关联关系删除', @parentId, '4',  '#',  'F', '0', 'datasync:relation:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络线路关联关系导出', @parentId, '5',  '#',  'F', '0', 'datasync:relation:export',       '#', 'admin', sysdate(), '', null, '');
