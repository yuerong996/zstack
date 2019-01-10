package org.zstack.header.vm.cdrom

import org.zstack.header.errorcode.ErrorCode
import org.zstack.header.vm.cdrom.VmCdRomInventory

doc {

	title "修改CDROM返回"

	ref {
		name "error"
		path "org.zstack.header.vm.cdrom.APIUpdateVmCdRomEvent.error"
		desc "错误码，若不为null，则表示操作失败, 操作成功时该字段为null",false
		type "ErrorCode"
		since "3.3"
		clz ErrorCode.class
	}
	ref {
		name "inventory"
		path "org.zstack.header.vm.cdrom.APIUpdateVmCdRomEvent.inventory"
		desc "null"
		type "VmCdRomInventory"
		since "3.3"
		clz VmCdRomInventory.class
	}
}
