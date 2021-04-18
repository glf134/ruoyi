-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('日志收集与分析系统', '2000', '1', '/datasync/analysis', 'C', '0', 'datasync:analysis:view', '#', 'admin', sysdate(), '', null, '日志收集与分析系统菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('日志收集与分析系统查询', @parentId, '1',  '#',  'F', '0', 'datasync:analysis:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('日志收集与分析系统新增', @parentId, '2',  '#',  'F', '0', 'datasync:analysis:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('日志收集与分析系统修改', @parentId, '3',  '#',  'F', '0', 'datasync:analysis:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('日志收集与分析系统删除', @parentId, '4',  '#',  'F', '0', 'datasync:analysis:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('日志收集与分析系统导出', @parentId, '5',  '#',  'F', '0', 'datasync:analysis:export',       '#', 'admin', sysdate(), '', null, '');
