package net.zaf.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("data_gate", "id", DataGate.class);
		arp.addMapping("data_index", "id", DataIndex.class);
		arp.addMapping("data_ship", "id", DataShip.class);
		arp.addMapping("sys_fun", "id", SysFun.class);
		arp.addMapping("sys_permission", "id", SysPermission.class);
	}
}

