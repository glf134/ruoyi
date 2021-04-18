-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据中心间距', '2000', '1', '/datasync/spacing', 'C', '0', 'datasync:spacing:view', '#', 'admin', sysdate(), '', null, '数据中心间距菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据中心间距查询', @parentId, '1',  '#',  'F', '0', 'datasync:spacing:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据中心间距新增', @parentId, '2',  '#',  'F', '0', 'datasync:spacing:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据中心间距修改', @parentId, '3',  '#',  'F', '0', 'datasync:spacing:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据中心间距删除', @parentId, '4',  '#',  'F', '0', 'datasync:spacing:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据中心间距导出', @parentId, '5',  '#',  'F', '0', 'datasync:spacing:export',       '#', 'admin', sysdate(), '', null, '');
