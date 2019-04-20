package org.zstack.testlib

import org.zstack.utils.gson.JSONObjectUtil
import org.zstack.core.Platform

trait ApiHelper {
    def errorOut(res) {
        assert res.error == null : "API failure: ${JSONObjectUtil.toJsonString(res.error)}"
        if (res.value.hasProperty("inventory")) {
            return res.value.inventory
        } else if (res.value.hasProperty("inventories")) {
            return res.value.inventories
        } else {
            return res.value
        }
    }
    
        def createDataVolumeTemplateFromVolumeBackup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.heder.storage.volume.backup.CreateDataVolumeTemplateFromVolumeBackupAction.class) Closure c) {
        def a = new org.zstack.heder.storage.volume.backup.CreateDataVolumeTemplateFromVolumeBackupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createRootVolumeTemplateFromVolumeBackup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.heder.storage.volume.backup.CreateRootVolumeTemplateFromVolumeBackupAction.class) Closure c) {
        def a = new org.zstack.heder.storage.volume.backup.CreateRootVolumeTemplateFromVolumeBackupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVmBackup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.heder.storage.volume.backup.CreateVmBackupAction.class) Closure c) {
        def a = new org.zstack.heder.storage.volume.backup.CreateVmBackupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVmFromVmBackup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.heder.storage.volume.backup.CreateVmFromVmBackupAction.class) Closure c) {
        def a = new org.zstack.heder.storage.volume.backup.CreateVmFromVmBackupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVolumeBackup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.heder.storage.volume.backup.CreateVolumeBackupAction.class) Closure c) {
        def a = new org.zstack.heder.storage.volume.backup.CreateVolumeBackupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVmBackup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.heder.storage.volume.backup.DeleteVmBackupAction.class) Closure c) {
        def a = new org.zstack.heder.storage.volume.backup.DeleteVmBackupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVolumeBackup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.heder.storage.volume.backup.DeleteVolumeBackupAction.class) Closure c) {
        def a = new org.zstack.heder.storage.volume.backup.DeleteVolumeBackupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVolumeBackup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.heder.storage.volume.backup.QueryVolumeBackupAction.class) Closure c) {
        def a = new org.zstack.heder.storage.volume.backup.QueryVolumeBackupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def recoverBackupFromImageStoreBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.heder.storage.volume.backup.RecoverBackupFromImageStoreBackupStorageAction.class) Closure c) {
        def a = new org.zstack.heder.storage.volume.backup.RecoverBackupFromImageStoreBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def recoverVmBackupFromImageStoreBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.heder.storage.volume.backup.RecoverVmBackupFromImageStoreBackupStorageAction.class) Closure c) {
        def a = new org.zstack.heder.storage.volume.backup.RecoverVmBackupFromImageStoreBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def revertVmFromVmBackup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.heder.storage.volume.backup.RevertVmFromVmBackupAction.class) Closure c) {
        def a = new org.zstack.heder.storage.volume.backup.RevertVmFromVmBackupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def revertVolumeFromVolumeBackup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.heder.storage.volume.backup.RevertVolumeFromVolumeBackupAction.class) Closure c) {
        def a = new org.zstack.heder.storage.volume.backup.RevertVolumeFromVolumeBackupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncBackupFromImageStoreBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.heder.storage.volume.backup.SyncBackupFromImageStoreBackupStorageAction.class) Closure c) {
        def a = new org.zstack.heder.storage.volume.backup.SyncBackupFromImageStoreBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncVmBackupFromImageStoreBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.heder.storage.volume.backup.SyncVmBackupFromImageStoreBackupStorageAction.class) Closure c) {
        def a = new org.zstack.heder.storage.volume.backup.SyncVmBackupFromImageStoreBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addAliyunEbsBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddAliyunEbsBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddAliyunEbsBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addAliyunEbsPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddAliyunEbsPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddAliyunEbsPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addAliyunKeySecret(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddAliyunKeySecretAction.class) Closure c) {
        def a = new org.zstack.sdk.AddAliyunKeySecretAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addAliyunNasAccessGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddAliyunNasAccessGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.AddAliyunNasAccessGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addAliyunNasFileSystem(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddAliyunNasFileSystemAction.class) Closure c) {
        def a = new org.zstack.sdk.AddAliyunNasFileSystemAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addAliyunNasMountTarget(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddAliyunNasMountTargetAction.class) Closure c) {
        def a = new org.zstack.sdk.AddAliyunNasMountTargetAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addAliyunNasPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddAliyunNasPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddAliyunNasPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addAliyunPanguPartition(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddAliyunPanguPartitionAction.class) Closure c) {
        def a = new org.zstack.sdk.AddAliyunPanguPartitionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addCephBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddCephBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddCephBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addCephPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddCephPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddCephPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addCephPrimaryStoragePool(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddCephPrimaryStoragePoolAction.class) Closure c) {
        def a = new org.zstack.sdk.AddCephPrimaryStoragePoolAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addCertificateToLoadBalancerListener(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddCertificateToLoadBalancerListenerAction.class) Closure c) {
        def a = new org.zstack.sdk.AddCertificateToLoadBalancerListenerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addConnectionAccessPointFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddConnectionAccessPointFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.AddConnectionAccessPointFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addDataCenterFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddDataCenterFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.AddDataCenterFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addDisasterImageStoreBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddDisasterImageStoreBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddDisasterImageStoreBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addDnsToL3Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddDnsToL3NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.AddDnsToL3NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addDnsToVpcRouter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddDnsToVpcRouterAction.class) Closure c) {
        def a = new org.zstack.sdk.AddDnsToVpcRouterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addFusionstorBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddFusionstorBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddFusionstorBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addFusionstorPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddFusionstorPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddFusionstorPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addHostRouteToL3Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddHostRouteToL3NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.AddHostRouteToL3NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addHybridKeySecret(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddHybridKeySecretAction.class) Closure c) {
        def a = new org.zstack.sdk.AddHybridKeySecretAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addIdentityZoneFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddIdentityZoneFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.AddIdentityZoneFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addImage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddImageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddImageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addImageStoreBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddImageStoreBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddImageStoreBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addIpRange(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddIpRangeAction.class) Closure c) {
        def a = new org.zstack.sdk.AddIpRangeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addIpRangeByNetworkCidr(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddIpRangeByNetworkCidrAction.class) Closure c) {
        def a = new org.zstack.sdk.AddIpRangeByNetworkCidrAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addIpv6Range(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddIpv6RangeAction.class) Closure c) {
        def a = new org.zstack.sdk.AddIpv6RangeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addIpv6RangeByNetworkCidr(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddIpv6RangeByNetworkCidrAction.class) Closure c) {
        def a = new org.zstack.sdk.AddIpv6RangeByNetworkCidrAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addIscsiServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddIscsiServerAction.class) Closure c) {
        def a = new org.zstack.sdk.AddIscsiServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addKVMHost(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddKVMHostAction.class) Closure c) {
        def a = new org.zstack.sdk.AddKVMHostAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addKVMHostFromConfigFile(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddKVMHostFromConfigFileAction.class) Closure c) {
        def a = new org.zstack.sdk.AddKVMHostFromConfigFileAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addLdapServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddLdapServerAction.class) Closure c) {
        def a = new org.zstack.sdk.AddLdapServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addLocalPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddLocalPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddLocalPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addMonToCephBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddMonToCephBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddMonToCephBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addMonToCephPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddMonToCephPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddMonToCephPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addMonToFusionstorBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddMonToFusionstorBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddMonToFusionstorBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addMonToFusionstorPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddMonToFusionstorPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddMonToFusionstorPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addNfsPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddNfsPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddNfsPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addOssBucketFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddOssBucketFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.AddOssBucketFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addPreconfigurationTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddPreconfigurationTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.AddPreconfigurationTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addRemoteCidrsToIPsecConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddRemoteCidrsToIPsecConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.AddRemoteCidrsToIPsecConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addSchedulerJobGroupToSchedulerTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddSchedulerJobGroupToSchedulerTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.AddSchedulerJobGroupToSchedulerTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addSchedulerJobToSchedulerTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddSchedulerJobToSchedulerTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.AddSchedulerJobToSchedulerTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addSchedulerJobsToSchedulerJobGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddSchedulerJobsToSchedulerJobGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.AddSchedulerJobsToSchedulerJobGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addSecurityGroupRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddSecurityGroupRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.AddSecurityGroupRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addSftpBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddSftpBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddSftpBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addSharedBlockGroupPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddSharedBlockGroupPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddSharedBlockGroupPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addSharedBlockToSharedBlockGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddSharedBlockToSharedBlockGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.AddSharedBlockToSharedBlockGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addSharedMountPointPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddSharedMountPointPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddSharedMountPointPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addSimulatorBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddSimulatorBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddSimulatorBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addSimulatorHost(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddSimulatorHostAction.class) Closure c) {
        def a = new org.zstack.sdk.AddSimulatorHostAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addSimulatorPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddSimulatorPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddSimulatorPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addStackTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddStackTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.AddStackTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addUserToGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddUserToGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.AddUserToGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addV2VConversionHost(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddV2VConversionHostAction.class) Closure c) {
        def a = new org.zstack.sdk.AddV2VConversionHostAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addVCenter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddVCenterAction.class) Closure c) {
        def a = new org.zstack.sdk.AddVCenterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addVRouterNetworksToOspfArea(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddVRouterNetworksToOspfAreaAction.class) Closure c) {
        def a = new org.zstack.sdk.AddVRouterNetworksToOspfAreaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addVRouterRouteEntry(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddVRouterRouteEntryAction.class) Closure c) {
        def a = new org.zstack.sdk.AddVRouterRouteEntryAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addVmNicToLoadBalancer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddVmNicToLoadBalancerAction.class) Closure c) {
        def a = new org.zstack.sdk.AddVmNicToLoadBalancerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addVmNicToSecurityGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddVmNicToSecurityGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.AddVmNicToSecurityGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addVmToAffinityGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddVmToAffinityGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.AddVmToAffinityGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addZsesPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AddZsesPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.AddZsesPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachAliyunDiskToEcs(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachAliyunDiskToEcsAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachAliyunDiskToEcsAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachAliyunKey(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachAliyunKeyAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachAliyunKeyAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachAutoScalingTemplateToGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachAutoScalingTemplateToGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachAutoScalingTemplateToGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachBackupStorageToZone(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachBackupStorageToZoneAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachBackupStorageToZoneAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachBaremetalPxeServerToCluster(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachBaremetalPxeServerToClusterAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachBaremetalPxeServerToClusterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachDataVolumeToVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachDataVolumeToVmAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachDataVolumeToVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachEip(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachEipAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachEipAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachHybridEipToEcs(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachHybridEipToEcsAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachHybridEipToEcsAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachHybridKey(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachHybridKeyAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachHybridKeyAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachIscsiServerToCluster(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachIscsiServerToClusterAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachIscsiServerToClusterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachIsoToVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachIsoToVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachIsoToVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachL2NetworkToCluster(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachL2NetworkToClusterAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachL2NetworkToClusterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachL3NetworkToVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachL3NetworkToVmAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachL3NetworkToVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachL3NetworkToVmNic(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachL3NetworkToVmNicAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachL3NetworkToVmNicAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachL3NetworksToIPsecConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachL3NetworksToIPsecConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachL3NetworksToIPsecConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachMonitorTriggerToTriggerAction(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachMonitorTriggerActionToTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachMonitorTriggerActionToTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachNetworkServiceToL3Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachNetworkServiceToL3NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachNetworkServiceToL3NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachOssBucketToEcsDataCenter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachOssBucketToEcsDataCenterAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachOssBucketToEcsDataCenterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachPciDeviceToVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachPciDeviceToVmAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachPciDeviceToVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachPoliciesToUser(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachPoliciesToUserAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachPoliciesToUserAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachPolicyToUser(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachPolicyToUserAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachPolicyToUserAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachPolicyToUserGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachPolicyToUserGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachPolicyToUserGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachPortForwardingRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachPortForwardingRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachPortForwardingRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachPrimaryStorageToCluster(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachPrimaryStorageToClusterAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachPrimaryStorageToClusterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachScsiLunToVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachScsiLunToVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachScsiLunToVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachSecurityGroupToL3Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachSecurityGroupToL3NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachSecurityGroupToL3NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachTagToResources(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachTagToResourcesAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachTagToResourcesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachUsbDeviceToVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachUsbDeviceToVmAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachUsbDeviceToVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachVRouterRouteTableToVRouter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachVRouterRouteTableToVRouterAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachVRouterRouteTableToVRouterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachVmNicToVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.AttachVmNicToVmAction.class) Closure c) {
        def a = new org.zstack.sdk.AttachVmNicToVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def backupDatabaseToPublicCloud(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.BackupDatabaseToPublicCloudAction.class) Closure c) {
        def a = new org.zstack.sdk.BackupDatabaseToPublicCloudAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def backupStorageMigrateImage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.BackupStorageMigrateImageAction.class) Closure c) {
        def a = new org.zstack.sdk.BackupStorageMigrateImageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def batchCreateBaremetalChassis(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.BatchCreateBaremetalChassisAction.class) Closure c) {
        def a = new org.zstack.sdk.BatchCreateBaremetalChassisAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def batchDeleteVolumeSnapshot(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.BatchDeleteVolumeSnapshotAction.class) Closure c) {
        def a = new org.zstack.sdk.BatchDeleteVolumeSnapshotAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def batchQuery(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.BatchQueryAction.class) Closure c) {
        def a = new org.zstack.sdk.BatchQueryAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def calculateAccountBillingSpending(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CalculateAccountBillingSpendingAction.class) Closure c) {
        def a = new org.zstack.sdk.CalculateAccountBillingSpendingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def calculateAccountSpending(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CalculateAccountSpendingAction.class) Closure c) {
        def a = new org.zstack.sdk.CalculateAccountSpendingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def calculateResourceSpending(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CalculateResourceSpendingAction.class) Closure c) {
        def a = new org.zstack.sdk.CalculateResourceSpendingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def cancelLongJob(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CancelLongJobAction.class) Closure c) {
        def a = new org.zstack.sdk.CancelLongJobAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeAccessKeyState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeAccessKeyStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeAccessKeyStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeAffinityGroupState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeAffinityGroupStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeAffinityGroupStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeAutoScalingGroupState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeAutoScalingGroupStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeAutoScalingGroupStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeBackupStorageState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeBackupStorageStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeBackupStorageStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeBaremetalChassisState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeBaremetalChassisStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeBaremetalChassisStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeClusterState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeClusterStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeClusterStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeDiskOfferingState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeDiskOfferingStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeDiskOfferingStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeEipState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeEipStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeEipStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeHostState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeHostStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeHostStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeIPSecConnectionState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeIPSecConnectionStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeIPSecConnectionStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeImageState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeImageStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeImageStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeInstanceOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeInstanceOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeInstanceOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeInstanceOfferingState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeInstanceOfferingStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeInstanceOfferingStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeL3NetworkState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeL3NetworkStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeL3NetworkStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeLoadBalancerListener(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeLoadBalancerListenerAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeLoadBalancerListenerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeMediaState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeMediaStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeMediaStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeMonitorTriggerStateAction(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeMonitorTriggerActionStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeMonitorTriggerActionStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeMonitorTriggerState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeMonitorTriggerStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeMonitorTriggerStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changePortForwardingRuleState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangePortForwardingRuleStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangePortForwardingRuleStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changePreconfigurationTemplateState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangePreconfigurationTemplateStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangePreconfigurationTemplateStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changePrimaryStorageState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangePrimaryStorageStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangePrimaryStorageStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeResourceOwner(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeResourceOwnerAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeResourceOwnerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeSchedulerState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeSchedulerStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeSchedulerStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeSecurityGroupState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeSecurityGroupStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeSecurityGroupStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeV2VConversionHostState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeV2VConversionHostStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeV2VConversionHostStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeVipState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeVipStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeVipStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeVmImage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeVmImageAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeVmImageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeVmPassword(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeVmPasswordAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeVmPasswordAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeVolumeState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeVolumeStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeVolumeStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeZoneState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ChangeZoneStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ChangeZoneStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def checkApiPermission(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CheckApiPermissionAction.class) Closure c) {
        def a = new org.zstack.sdk.CheckApiPermissionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def checkBaremetalChassisConfigFile(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CheckBaremetalChassisConfigFileAction.class) Closure c) {
        def a = new org.zstack.sdk.CheckBaremetalChassisConfigFileAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def checkElaborationContent(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CheckElaborationContentAction.class) Closure c) {
        def a = new org.zstack.sdk.CheckElaborationContentAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def checkIpAvailability(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CheckIpAvailabilityAction.class) Closure c) {
        def a = new org.zstack.sdk.CheckIpAvailabilityAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def checkKVMHostConfigFile(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CheckKVMHostConfigFileAction.class) Closure c) {
        def a = new org.zstack.sdk.CheckKVMHostConfigFileAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def checkResourcePermission(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CheckResourcePermissionAction.class) Closure c) {
        def a = new org.zstack.sdk.CheckResourcePermissionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def checkScsiLunClusterStatus(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CheckScsiLunClusterStatusAction.class) Closure c) {
        def a = new org.zstack.sdk.CheckScsiLunClusterStatusAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def checkStackTemplateParameters(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CheckStackTemplateParametersAction.class) Closure c) {
        def a = new org.zstack.sdk.CheckStackTemplateParametersAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def cleanInvalidLdapBinding(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CleanInvalidLdapBindingAction.class) Closure c) {
        def a = new org.zstack.sdk.CleanInvalidLdapBindingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def cleanUpBaremetalChassisBonding(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CleanUpBaremetalChassisBondingAction.class) Closure c) {
        def a = new org.zstack.sdk.CleanUpBaremetalChassisBondingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def cleanUpImageCacheOnPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CleanUpImageCacheOnPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.CleanUpImageCacheOnPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def cleanUpTrashOnBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CleanUpTrashOnBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.CleanUpTrashOnBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def cleanUpTrashOnPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CleanUpTrashOnPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.CleanUpTrashOnPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def cleanV2VConversionCache(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CleanV2VConversionCacheAction.class) Closure c) {
        def a = new org.zstack.sdk.CleanV2VConversionCacheAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def cloneVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CloneVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.CloneVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def convertVmFromForeignHypervisor(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ConvertVmFromForeignHypervisorAction.class) Closure c) {
        def a = new org.zstack.sdk.ConvertVmFromForeignHypervisorAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAccessKey(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAccessKeyAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAccessKeyAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAccount(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAccountAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAccountAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAffinityGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAffinityGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAffinityGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAliyunDiskFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAliyunDiskFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAliyunDiskFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAliyunNasAccessGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAliyunNasAccessGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAliyunNasAccessGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAliyunNasAccessGroupRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAliyunNasAccessGroupRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAliyunNasAccessGroupRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAliyunNasFileSystem(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAliyunNasFileSystemAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAliyunNasFileSystemAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAliyunNasMountTarget(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAliyunNasMountTargetAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAliyunNasMountTargetAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAliyunProxyVSwitch(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAliyunProxyVSwitchAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAliyunProxyVSwitchAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAliyunProxyVpc(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAliyunProxyVpcAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAliyunProxyVpcAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAliyunRouterInterfaceRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAliyunRouterInterfaceRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAliyunRouterInterfaceRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAliyunSnapshotRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAliyunSnapshotRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAliyunSnapshotRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAliyunVpcVirtualRouterEntryRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAliyunVpcVirtualRouterEntryRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAliyunVpcVirtualRouterEntryRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAutoScalingGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAutoScalingGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAutoScalingGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAutoScalingGroupAddingNewInstanceRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAutoScalingGroupAddingNewInstanceRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAutoScalingGroupAddingNewInstanceRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAutoScalingGroupRemovalInstanceRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAutoScalingGroupRemovalInstanceRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAutoScalingGroupRemovalInstanceRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAutoScalingRuleAlarmTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAutoScalingRuleAlarmTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAutoScalingRuleAlarmTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAutoScalingVmTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateAutoScalingVmTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateAutoScalingVmTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createBaremetalBonding(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateBaremetalBondingAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateBaremetalBondingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createBaremetalChassis(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateBaremetalChassisAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateBaremetalChassisAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createBaremetalInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateBaremetalInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateBaremetalInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createBaremetalPxeServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateBaremetalPxeServerAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateBaremetalPxeServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createCertificate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateCertificateAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateCertificateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createCluster(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateClusterAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateClusterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createConnectionBetweenL3NetworkAndAliyunVSwitch(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateConnectionBetweenL3NetworkAndAliyunVSwitchAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateConnectionBetweenL3NetworkAndAliyunVSwitchAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createDahoVllRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateDahoVllRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateDahoVllRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createDataVolume(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateDataVolumeAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateDataVolumeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createDataVolumeFromVolumeSnapshot(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateDataVolumeFromVolumeSnapshotAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateDataVolumeFromVolumeSnapshotAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createDataVolumeFromVolumeTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateDataVolumeFromVolumeTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateDataVolumeFromVolumeTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createDataVolumeTemplateFromVolume(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateDataVolumeTemplateFromVolumeAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateDataVolumeTemplateFromVolumeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createDataVolumeTemplateFromVolumeSnapshot(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateDataVolumeTemplateFromVolumeSnapshotAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateDataVolumeTemplateFromVolumeSnapshotAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createDiskOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateDiskOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateDiskOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createEcsImageFromEcsSnapshot(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateEcsImageFromEcsSnapshotAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateEcsImageFromEcsSnapshotAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createEcsImageFromLocalImage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateEcsImageFromLocalImageAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateEcsImageFromLocalImageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createEcsInstanceFromEcsImage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateEcsInstanceFromEcsImageAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateEcsInstanceFromEcsImageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createEcsSecurityGroupRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateEcsSecurityGroupRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateEcsSecurityGroupRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createEcsSecurityGroupRuleRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateEcsSecurityGroupRuleRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateEcsSecurityGroupRuleRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createEcsVSwitchRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateEcsVSwitchRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateEcsVSwitchRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createEcsVpcRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateEcsVpcRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateEcsVpcRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createEip(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateEipAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateEipAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createEmailMedia(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateEmailMediaAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateEmailMediaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createEmailMonitorTriggerAction(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateEmailMonitorTriggerActionAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateEmailMonitorTriggerActionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createHybridEip(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateHybridEipAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateHybridEipAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createIPsecConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateIPsecConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateIPsecConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createInstanceOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateInstanceOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateInstanceOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createL2NoVlanNetwork(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateL2NoVlanNetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateL2NoVlanNetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createL2VlanNetwork(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateL2VlanNetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateL2VlanNetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createL2VxlanNetwork(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateL2VxlanNetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateL2VxlanNetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createL2VxlanNetworkPool(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateL2VxlanNetworkPoolAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateL2VxlanNetworkPoolAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createL3Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateL3NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateL3NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createLdapBinding(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateLdapBindingAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateLdapBindingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createLoadBalancer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateLoadBalancerAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateLoadBalancerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createLoadBalancerListener(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateLoadBalancerListenerAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateLoadBalancerListenerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createMiniCluster(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateMiniClusterAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateMiniClusterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createMonitorTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateMonitorTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateMonitorTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createOssBackupBucketRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateOssBackupBucketRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateOssBackupBucketRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createOssBucketRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateOssBucketRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateOssBucketRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createPciDeviceOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreatePciDeviceOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.CreatePciDeviceOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createPciDeviceSpec(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreatePciDeviceSpecAction.class) Closure c) {
        def a = new org.zstack.sdk.CreatePciDeviceSpecAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createPolicy(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreatePolicyAction.class) Closure c) {
        def a = new org.zstack.sdk.CreatePolicyAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createPortForwardingRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreatePortForwardingRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.CreatePortForwardingRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createResourcePrice(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateResourcePriceAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateResourcePriceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createResourceStack(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateResourceStackAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateResourceStackAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createRootVolumeTemplateFromRootVolume(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateRootVolumeTemplateFromRootVolumeAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateRootVolumeTemplateFromRootVolumeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createRootVolumeTemplateFromVolumeSnapshot(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateRootVolumeTemplateFromVolumeSnapshotAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateRootVolumeTemplateFromVolumeSnapshotAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createSchedulerJob(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateSchedulerJobAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateSchedulerJobAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createSchedulerJobGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateSchedulerJobGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateSchedulerJobGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createSchedulerTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateSchedulerTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateSchedulerTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createSecurityGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateSecurityGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateSecurityGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createSystemTag(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateSystemTagAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateSystemTagAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createTag(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateTagAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateTagAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createUser(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateUserAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateUserAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createUserGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateUserGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateUserGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createUserTag(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateUserTagAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateUserTagAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVRouterOspfArea(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVRouterOspfAreaAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVRouterOspfAreaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVRouterRouteTable(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVRouterRouteTableAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVRouterRouteTableAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVip(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVipAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVipAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVirtualRouterOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVirtualRouterOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVirtualRouterOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVmCdRom(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVmCdRomAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVmCdRomAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVmNic(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVmNicAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVmNicAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVniRange(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVniRangeAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVniRangeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVolumeSnapshot(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVolumeSnapshotAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVolumeSnapshotAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVolumesSnapshot(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVolumesSnapshotAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVolumesSnapshotAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVpcUserVpnGatewayRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVpcUserVpnGatewayRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVpcUserVpnGatewayRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVpcVRouter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVpcVRouterAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVpcVRouterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVpcVpnConnectionRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVpcVpnConnectionRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVpcVpnConnectionRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVpnIkeConfig(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVpnIkeConfigAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVpnIkeConfigAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVpnIpsecConfig(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVpnIpsecConfigAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVpnIpsecConfigAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createVxlanVtep(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateVxlanVtepAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateVxlanVtepAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createWebhook(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateWebhookAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateWebhookAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createZone(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.CreateZoneAction.class) Closure c) {
        def a = new org.zstack.sdk.CreateZoneAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def debugSignal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DebugSignalAction.class) Closure c) {
        def a = new org.zstack.sdk.DebugSignalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def decodeStackTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DecodeStackTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.DecodeStackTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAccessKey(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAccessKeyAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAccessKeyAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAccount(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAccountAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAccountAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAffinityGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAffinityGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAffinityGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAlert(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAlertAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAlertAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAliyunDiskFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAliyunDiskFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAliyunDiskFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAliyunDiskFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAliyunDiskFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAliyunDiskFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAliyunKeySecret(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAliyunKeySecretAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAliyunKeySecretAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAliyunNasAccessGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAliyunNasAccessGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAliyunNasAccessGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAliyunNasAccessGroupRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAliyunNasAccessGroupRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAliyunNasAccessGroupRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAliyunPanguPartition(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAliyunPanguPartitionAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAliyunPanguPartitionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAliyunRouteEntryRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAliyunRouteEntryRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAliyunRouteEntryRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAliyunRouterInterfaceLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAliyunRouterInterfaceLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAliyunRouterInterfaceLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAliyunRouterInterfaceRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAliyunRouterInterfaceRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAliyunRouterInterfaceRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAliyunSnapshotFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAliyunSnapshotFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAliyunSnapshotFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAliyunSnapshotFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAliyunSnapshotFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAliyunSnapshotFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAllEcsInstancesFromDataCenter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAllEcsInstancesFromDataCenterAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAllEcsInstancesFromDataCenterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAutoScalingGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAutoScalingGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAutoScalingGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAutoScalingGroupInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAutoScalingGroupInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAutoScalingGroupInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAutoScalingRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAutoScalingRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAutoScalingRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAutoScalingRuleTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAutoScalingRuleTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAutoScalingRuleTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAutoScalingTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteAutoScalingTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteAutoScalingTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteBackupFileInPublic(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteBackupFileInPublicAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteBackupFileInPublicAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteBaremetalChassis(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteBaremetalChassisAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteBaremetalChassisAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteBaremetalPxeServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteBaremetalPxeServerAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteBaremetalPxeServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteCephPrimaryStoragePool(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteCephPrimaryStoragePoolAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteCephPrimaryStoragePoolAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteCertificate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteCertificateAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteCertificateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteCluster(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteClusterAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteClusterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteConnectionAccessPointLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteConnectionAccessPointLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteConnectionAccessPointLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteConnectionBetweenL3NetWorkAndAliyunVSwitch(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteConnectionBetweenL3NetWorkAndAliyunVSwitchAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteConnectionBetweenL3NetWorkAndAliyunVSwitchAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteDahoCloudConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteDahoCloudConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteDahoCloudConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteDahoDataCenterConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteDahoDataCenterConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteDahoDataCenterConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteDahoVll(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteDahoVllAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteDahoVllAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteDataCenterInLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteDataCenterInLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteDataCenterInLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteDataVolume(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteDataVolumeAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteDataVolumeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteDiskOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteDiskOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteDiskOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteEcsImageLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteEcsImageLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteEcsImageLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteEcsImageRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteEcsImageRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteEcsImageRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteEcsInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteEcsInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteEcsInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteEcsInstanceLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteEcsInstanceLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteEcsInstanceLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteEcsSecurityGroupInLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteEcsSecurityGroupInLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteEcsSecurityGroupInLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteEcsSecurityGroupRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteEcsSecurityGroupRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteEcsSecurityGroupRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteEcsSecurityGroupRuleRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteEcsSecurityGroupRuleRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteEcsSecurityGroupRuleRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteEcsVSwitchInLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteEcsVSwitchInLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteEcsVSwitchInLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteEcsVSwitchRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteEcsVSwitchRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteEcsVSwitchRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteEcsVpcInLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteEcsVpcInLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteEcsVpcInLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteEcsVpcRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteEcsVpcRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteEcsVpcRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteEip(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteEipAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteEipAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteExportedImageFromBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteExportedImageFromBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteExportedImageFromBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteGCJob(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteGCJobAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteGCJobAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteHost(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteHostAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteHostAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteHybridEipFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteHybridEipFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteHybridEipFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteHybridEipRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteHybridEipRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteHybridEipRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteHybridKeySecret(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteHybridKeySecretAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteHybridKeySecretAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteIPsecConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteIPsecConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteIPsecConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteIdentityZoneInLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteIdentityZoneInLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteIdentityZoneInLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteImage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteImageAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteImageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteInstanceOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteInstanceOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteInstanceOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteIpRange(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteIpRangeAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteIpRangeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteIscsiServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteIscsiServerAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteIscsiServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteL2Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteL2NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteL2NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteL3Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteL3NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteL3NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteLdapBinding(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteLdapBindingAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteLdapBindingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteLdapServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteLdapServerAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteLdapServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteLicense(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteLicenseAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteLicenseAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteLoadBalancer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteLoadBalancerAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteLoadBalancerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteLoadBalancerListener(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteLoadBalancerListenerAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteLoadBalancerListenerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteLongJob(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteLongJobAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteLongJobAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteMedia(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteMediaAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteMediaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteMonitorTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteMonitorTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteMonitorTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteMonitorTriggerAction(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteMonitorTriggerActionAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteMonitorTriggerActionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteNasFileSystem(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteNasFileSystemAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteNasFileSystemAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteNasMountTarget(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteNasMountTargetAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteNasMountTargetAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteNicQos(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteNicQosAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteNicQosAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteOssBucketFileRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteOssBucketFileRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteOssBucketFileRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteOssBucketNameLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteOssBucketNameLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteOssBucketNameLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteOssBucketRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteOssBucketRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteOssBucketRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deletePciDevice(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeletePciDeviceAction.class) Closure c) {
        def a = new org.zstack.sdk.DeletePciDeviceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deletePciDeviceOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeletePciDeviceOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.DeletePciDeviceOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deletePolicy(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeletePolicyAction.class) Closure c) {
        def a = new org.zstack.sdk.DeletePolicyAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deletePortForwardingRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeletePortForwardingRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.DeletePortForwardingRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deletePreconfigurationTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeletePreconfigurationTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.DeletePreconfigurationTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deletePrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeletePrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.DeletePrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteResourceConfig(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteResourceConfigAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteResourceConfigAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteResourcePrice(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteResourcePriceAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteResourcePriceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteResourceStack(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteResourceStackAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteResourceStackAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteSchedulerJob(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteSchedulerJobAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteSchedulerJobAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteSchedulerJobGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteSchedulerJobGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteSchedulerJobGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteSchedulerTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteSchedulerTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteSchedulerTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteSecurityGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteSecurityGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteSecurityGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteSecurityGroupRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteSecurityGroupRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteSecurityGroupRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteStackTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteStackTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteStackTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteTag(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteTagAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteTagAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteUser(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteUserAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteUserAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteUserGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteUserGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteUserGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteV2VConversionHost(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteV2VConversionHostAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteV2VConversionHostAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVCenter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVCenterAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVCenterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVRouterOspfArea(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVRouterOspfAreaAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVRouterOspfAreaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVRouterRouteEntry(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVRouterRouteEntryAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVRouterRouteEntryAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVRouterRouteTable(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVRouterRouteTableAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVRouterRouteTableAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVip(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVipAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVipAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVipQos(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVipQosAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVipQosAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVirtualBorderRouterLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVirtualBorderRouterLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVirtualBorderRouterLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVirtualRouterLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVirtualRouterLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVirtualRouterLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVmBootMode(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVmBootModeAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVmBootModeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVmCdRom(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVmCdRomAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVmCdRomAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVmConsolePassword(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVmConsolePasswordAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVmConsolePasswordAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVmHostname(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVmHostnameAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVmHostnameAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVmInstanceHaLevel(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVmInstanceHaLevelAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVmInstanceHaLevelAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVmNic(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVmNicAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVmNicAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVmNicFromSecurityGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVmNicFromSecurityGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVmNicFromSecurityGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVmSshKey(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVmSshKeyAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVmSshKeyAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVmStaticIp(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVmStaticIpAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVmStaticIpAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVniRange(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVniRangeAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVniRangeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVolumeQos(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVolumeQosAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVolumeQosAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVolumeSnapshot(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVolumeSnapshotAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVolumeSnapshotAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVpcIkeConfigLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVpcIkeConfigLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVpcIkeConfigLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVpcIpSecConfigLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVpcIpSecConfigLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVpcIpSecConfigLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVpcUserVpnGatewayLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVpcUserVpnGatewayLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVpcUserVpnGatewayLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVpcUserVpnGatewayRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVpcUserVpnGatewayRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVpcUserVpnGatewayRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVpcVpnConnectionLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVpcVpnConnectionLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVpcVpnConnectionLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVpcVpnConnectionRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVpcVpnConnectionRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVpcVpnConnectionRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteVpcVpnGatewayLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteVpcVpnGatewayLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteVpcVpnGatewayLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteWebhook(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteWebhookAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteWebhookAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteZone(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DeleteZoneAction.class) Closure c) {
        def a = new org.zstack.sdk.DeleteZoneAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def destroyBaremetalInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DestroyBaremetalInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.DestroyBaremetalInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def destroyVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DestroyVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.DestroyVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachAliyunDiskFromEcs(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachAliyunDiskFromEcsAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachAliyunDiskFromEcsAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachAliyunKey(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachAliyunKeyAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachAliyunKeyAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachAutoScalingTemplateFromGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachAutoScalingTemplateFromGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachAutoScalingTemplateFromGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachBackupStorageFromZone(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachBackupStorageFromZoneAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachBackupStorageFromZoneAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachBaremetalPxeServerFromCluster(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachBaremetalPxeServerFromClusterAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachBaremetalPxeServerFromClusterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachDataVolumeFromVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachDataVolumeFromVmAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachDataVolumeFromVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachEip(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachEipAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachEipAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachHybridEipFromEcs(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachHybridEipFromEcsAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachHybridEipFromEcsAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachHybridKey(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachHybridKeyAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachHybridKeyAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachIscsiServerFromCluster(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachIscsiServerFromClusterAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachIscsiServerFromClusterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachIsoFromVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachIsoFromVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachIsoFromVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachL2NetworkFromCluster(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachL2NetworkFromClusterAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachL2NetworkFromClusterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachL3NetworkFromVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachL3NetworkFromVmAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachL3NetworkFromVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachL3NetworksFromIPsecConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachL3NetworksFromIPsecConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachL3NetworksFromIPsecConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachMonitorTriggerFromTriggerAction(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachMonitorTriggerActionFromTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachMonitorTriggerActionFromTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachNetworkServiceFromL3Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachNetworkServiceFromL3NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachNetworkServiceFromL3NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachOssBucketFromEcsDataCenter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachOssBucketFromEcsDataCenterAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachOssBucketFromEcsDataCenterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachPciDeviceFromVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachPciDeviceFromVmAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachPciDeviceFromVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachPoliciesFromUser(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachPoliciesFromUserAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachPoliciesFromUserAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachPolicyFromUser(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachPolicyFromUserAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachPolicyFromUserAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachPolicyFromUserGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachPolicyFromUserGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachPolicyFromUserGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachPortForwardingRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachPortForwardingRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachPortForwardingRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachPrimaryStorageFromCluster(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachPrimaryStorageFromClusterAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachPrimaryStorageFromClusterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachScsiLunFromVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachScsiLunFromVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachScsiLunFromVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachSecurityGroupFromL3Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachSecurityGroupFromL3NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachSecurityGroupFromL3NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachTagFromResources(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachTagFromResourcesAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachTagFromResourcesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachUsbDeviceFromVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachUsbDeviceFromVmAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachUsbDeviceFromVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachVRouterRouteTableFromVRouter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DetachVRouterRouteTableFromVRouterAction.class) Closure c) {
        def a = new org.zstack.sdk.DetachVRouterRouteTableFromVRouterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def downloadBackupFileFromPublicCloud(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.DownloadBackupFileFromPublicCloudAction.class) Closure c) {
        def a = new org.zstack.sdk.DownloadBackupFileFromPublicCloudAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def exportImageFromBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ExportImageFromBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.ExportImageFromBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def expungeBaremetalInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ExpungeBaremetalInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.ExpungeBaremetalInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def expungeDataVolume(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ExpungeDataVolumeAction.class) Closure c) {
        def a = new org.zstack.sdk.ExpungeDataVolumeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def expungeImage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ExpungeImageAction.class) Closure c) {
        def a = new org.zstack.sdk.ExpungeImageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def expungeVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ExpungeVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.ExpungeVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def gCAliyunSnapshotRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GCAliyunSnapshotRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.GCAliyunSnapshotRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def generateAccountBilling(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GenerateAccountBillingAction.class) Closure c) {
        def a = new org.zstack.sdk.GenerateAccountBillingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getAccountQuotaUsage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetAccountQuotaUsageAction.class) Closure c) {
        def a = new org.zstack.sdk.GetAccountQuotaUsageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getAliyunNasAccessGroupRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetAliyunNasAccessGroupRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.GetAliyunNasAccessGroupRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getAliyunNasFileSystemRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetAliyunNasFileSystemRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.GetAliyunNasFileSystemRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getAliyunNasMountTargetRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetAliyunNasMountTargetRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.GetAliyunNasMountTargetRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getAttachablePublicL3ForVRouter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetAttachablePublicL3ForVRouterAction.class) Closure c) {
        def a = new org.zstack.sdk.GetAttachablePublicL3ForVRouterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getAttachableVpcL3Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetAttachableVpcL3NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.GetAttachableVpcL3NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getAvailableTriggers(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetAvailableTriggersAction.class) Closure c) {
        def a = new org.zstack.sdk.GetAvailableTriggersAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getBackupStorageCandidatesForImageMigration(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetBackupStorageCandidatesForImageMigrationAction.class) Closure c) {
        def a = new org.zstack.sdk.GetBackupStorageCandidatesForImageMigrationAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getBackupStorageCapacity(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetBackupStorageCapacityAction.class) Closure c) {
        def a = new org.zstack.sdk.GetBackupStorageCapacityAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getBackupStorageForCreatingImageFromVolume(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetBackupStorageForCreatingImageFromVolumeAction.class) Closure c) {
        def a = new org.zstack.sdk.GetBackupStorageForCreatingImageFromVolumeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getBackupStorageForCreatingImageFromVolumeSnapshot(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetBackupStorageForCreatingImageFromVolumeSnapshotAction.class) Closure c) {
        def a = new org.zstack.sdk.GetBackupStorageForCreatingImageFromVolumeSnapshotAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getBackupStorageTypes(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetBackupStorageTypesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetBackupStorageTypesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getBaremetalChassisPowerStatus(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetBaremetalChassisPowerStatusAction.class) Closure c) {
        def a = new org.zstack.sdk.GetBaremetalChassisPowerStatusAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getCandidateIsoForAttachingVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetCandidateIsoForAttachingVmAction.class) Closure c) {
        def a = new org.zstack.sdk.GetCandidateIsoForAttachingVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getCandidateLdapEntryForBinding(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetCandidateLdapEntryForBindingAction.class) Closure c) {
        def a = new org.zstack.sdk.GetCandidateLdapEntryForBindingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getCandidatePrimaryStoragesForCreatingVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetCandidatePrimaryStoragesForCreatingVmAction.class) Closure c) {
        def a = new org.zstack.sdk.GetCandidatePrimaryStoragesForCreatingVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getCandidateVmForAttachingIso(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetCandidateVmForAttachingIsoAction.class) Closure c) {
        def a = new org.zstack.sdk.GetCandidateVmForAttachingIsoAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getCandidateVmNicForSecurityGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetCandidateVmNicForSecurityGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.GetCandidateVmNicForSecurityGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getCandidateVmNicsForLoadBalancer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetCandidateVmNicsForLoadBalancerAction.class) Closure c) {
        def a = new org.zstack.sdk.GetCandidateVmNicsForLoadBalancerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getCandidateZonesClustersHostsForCreatingVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetCandidateZonesClustersHostsForCreatingVmAction.class) Closure c) {
        def a = new org.zstack.sdk.GetCandidateZonesClustersHostsForCreatingVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getConnectionAccessPointFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetConnectionAccessPointFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.GetConnectionAccessPointFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getConnectionBetweenL3NetworkAndAliyunVSwitch(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetConnectionBetweenL3NetworkAndAliyunVSwitchAction.class) Closure c) {
        def a = new org.zstack.sdk.GetConnectionBetweenL3NetworkAndAliyunVSwitchAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getCpuMemoryCapacity(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetCpuMemoryCapacityAction.class) Closure c) {
        def a = new org.zstack.sdk.GetCpuMemoryCapacityAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getCreateEcsImageProgress(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetCreateEcsImageProgressAction.class) Closure c) {
        def a = new org.zstack.sdk.GetCreateEcsImageProgressAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getCurrentTime(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetCurrentTimeAction.class) Closure c) {
        def a = new org.zstack.sdk.GetCurrentTimeAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getDataCenterFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetDataCenterFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.GetDataCenterFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getDataVolumeAttachableVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetDataVolumeAttachableVmAction.class) Closure c) {
        def a = new org.zstack.sdk.GetDataVolumeAttachableVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getEcsInstanceType(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetEcsInstanceTypeAction.class) Closure c) {
        def a = new org.zstack.sdk.GetEcsInstanceTypeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getEcsInstanceVncUrl(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetEcsInstanceVncUrlAction.class) Closure c) {
        def a = new org.zstack.sdk.GetEcsInstanceVncUrlAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getEipAttachableVmNics(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetEipAttachableVmNicsAction.class) Closure c) {
        def a = new org.zstack.sdk.GetEipAttachableVmNicsAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getElaborationCategories(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetElaborationCategoriesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetElaborationCategoriesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getElaborations(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetElaborationsAction.class) Closure c) {
        def a = new org.zstack.sdk.GetElaborationsAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getFreeIpOfIpRange(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetFreeIpOfIpRangeAction.class) Closure c) {
        def a = new org.zstack.sdk.GetFreeIpOfIpRangeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getFreeIpOfL3Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetFreeIpOfL3NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.GetFreeIpOfL3NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getHostAllocatorStrategies(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetHostAllocatorStrategiesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetHostAllocatorStrategiesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getHostIommuState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetHostIommuStateAction.class) Closure c) {
        def a = new org.zstack.sdk.GetHostIommuStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getHostIommuStatus(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetHostIommuStatusAction.class) Closure c) {
        def a = new org.zstack.sdk.GetHostIommuStatusAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getHypervisorTypes(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetHypervisorTypesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetHypervisorTypesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getIdentityZoneFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetIdentityZoneFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.GetIdentityZoneFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getImageCandidatesForVmToChange(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetImageCandidatesForVmToChangeAction.class) Closure c) {
        def a = new org.zstack.sdk.GetImageCandidatesForVmToChangeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getImageQga(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetImageQgaAction.class) Closure c) {
        def a = new org.zstack.sdk.GetImageQgaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getImagesFromImageStoreBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetImagesFromImageStoreBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.GetImagesFromImageStoreBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getInterdependentL3NetworksImages(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetInterdependentL3NetworksImagesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetInterdependentL3NetworksImagesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getIpAddressCapacity(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetIpAddressCapacityAction.class) Closure c) {
        def a = new org.zstack.sdk.GetIpAddressCapacityAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getL2NetworkTypes(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetL2NetworkTypesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetL2NetworkTypesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getL3NetworkDhcpIpAddress(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetL3NetworkDhcpIpAddressAction.class) Closure c) {
        def a = new org.zstack.sdk.GetL3NetworkDhcpIpAddressAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getL3NetworkMtu(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetL3NetworkMtuAction.class) Closure c) {
        def a = new org.zstack.sdk.GetL3NetworkMtuAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getL3NetworkRouterInterfaceIp(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetL3NetworkRouterInterfaceIpAction.class) Closure c) {
        def a = new org.zstack.sdk.GetL3NetworkRouterInterfaceIpAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getL3NetworkTypes(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetL3NetworkTypesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetL3NetworkTypesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getLdapEntry(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetLdapEntryAction.class) Closure c) {
        def a = new org.zstack.sdk.GetLdapEntryAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getLicenseAddOns(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetLicenseAddOnsAction.class) Closure c) {
        def a = new org.zstack.sdk.GetLicenseAddOnsAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getLicenseCapabilities(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetLicenseCapabilitiesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetLicenseCapabilitiesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getLicenseInfo(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetLicenseInfoAction.class) Closure c) {
        def a = new org.zstack.sdk.GetLicenseInfoAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getLocalStorageHostDiskCapacity(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetLocalStorageHostDiskCapacityAction.class) Closure c) {
        def a = new org.zstack.sdk.GetLocalStorageHostDiskCapacityAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getLoginCaptcha(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetLoginCaptchaAction.class) Closure c) {
        def a = new org.zstack.sdk.GetLoginCaptchaAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getMissedElaboration(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetMissedElaborationAction.class) Closure c) {
        def a = new org.zstack.sdk.GetMissedElaborationAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getMonitorItem(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetMonitorItemAction.class) Closure c) {
        def a = new org.zstack.sdk.GetMonitorItemAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getNetworkServiceTypes(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetNetworkServiceTypesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetNetworkServiceTypesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getNicQos(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetNicQosAction.class) Closure c) {
        def a = new org.zstack.sdk.GetNicQosAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getNoTriggerSchedulerJobs(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetNoTriggerSchedulerJobsAction.class) Closure c) {
        def a = new org.zstack.sdk.GetNoTriggerSchedulerJobsAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getOssBackupBucketFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetOssBackupBucketFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.GetOssBackupBucketFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getOssBucketFileFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetOssBucketFileFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.GetOssBucketFileFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getOssBucketNameFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetOssBucketNameFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.GetOssBucketNameFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getPciDeviceCandidatesForAttachingVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetPciDeviceCandidatesForAttachingVmAction.class) Closure c) {
        def a = new org.zstack.sdk.GetPciDeviceCandidatesForAttachingVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getPciDeviceCandidatesForNewCreateVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetPciDeviceCandidatesForNewCreateVmAction.class) Closure c) {
        def a = new org.zstack.sdk.GetPciDeviceCandidatesForNewCreateVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getPciDeviceSpecCandidates(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetPciDeviceSpecCandidatesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetPciDeviceSpecCandidatesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getPortForwardingAttachableVmNics(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetPortForwardingAttachableVmNicsAction.class) Closure c) {
        def a = new org.zstack.sdk.GetPortForwardingAttachableVmNicsAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getPrimaryStorageAllocatorStrategies(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetPrimaryStorageAllocatorStrategiesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetPrimaryStorageAllocatorStrategiesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getPrimaryStorageCandidatesForVmMigration(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetPrimaryStorageCandidatesForVmMigrationAction.class) Closure c) {
        def a = new org.zstack.sdk.GetPrimaryStorageCandidatesForVmMigrationAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getPrimaryStorageCandidatesForVolumeMigration(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetPrimaryStorageCandidatesForVolumeMigrationAction.class) Closure c) {
        def a = new org.zstack.sdk.GetPrimaryStorageCandidatesForVolumeMigrationAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getPrimaryStorageCapacity(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetPrimaryStorageCapacityAction.class) Closure c) {
        def a = new org.zstack.sdk.GetPrimaryStorageCapacityAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getPrimaryStorageTypes(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetPrimaryStorageTypesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetPrimaryStorageTypesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getResourceAccount(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetResourceAccountAction.class) Closure c) {
        def a = new org.zstack.sdk.GetResourceAccountAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getResourceBindableConfig(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetResourceBindableConfigAction.class) Closure c) {
        def a = new org.zstack.sdk.GetResourceBindableConfigAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getResourceConfig(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetResourceConfigAction.class) Closure c) {
        def a = new org.zstack.sdk.GetResourceConfigAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getResourceFromResourceStack(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetResourceFromResourceStackAction.class) Closure c) {
        def a = new org.zstack.sdk.GetResourceFromResourceStackAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getResourceNames(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetResourceNamesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetResourceNamesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getScsiLunCandidatesForAttachingVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetScsiLunCandidatesForAttachingVmAction.class) Closure c) {
        def a = new org.zstack.sdk.GetScsiLunCandidatesForAttachingVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getSharedBlockCandidate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetSharedBlockCandidateAction.class) Closure c) {
        def a = new org.zstack.sdk.GetSharedBlockCandidateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getSupportedCloudFormationResources(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetSupportedCloudFormationResourcesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetSupportedCloudFormationResourcesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getTaskProgress(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetTaskProgressAction.class) Closure c) {
        def a = new org.zstack.sdk.GetTaskProgressAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getTrashOnBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetTrashOnBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.GetTrashOnBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getTrashOnPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetTrashOnPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.GetTrashOnPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getTwoFactorAuthenticationSecret(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetTwoFactorAuthenticationSecretAction.class) Closure c) {
        def a = new org.zstack.sdk.GetTwoFactorAuthenticationSecretAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getTwoFactorAuthenticationState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetTwoFactorAuthenticationStateAction.class) Closure c) {
        def a = new org.zstack.sdk.GetTwoFactorAuthenticationStateAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getUsbDeviceCandidatesForAttachingVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetUsbDeviceCandidatesForAttachingVmAction.class) Closure c) {
        def a = new org.zstack.sdk.GetUsbDeviceCandidatesForAttachingVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVRouterOspfNeighbor(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVRouterOspfNeighborAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVRouterOspfNeighborAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVRouterRouteTable(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVRouterRouteTableAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVRouterRouteTableAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVRouterRouterId(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVRouterRouterIdAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVRouterRouterIdAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVersion(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVersionAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVersionAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVipQos(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVipQosAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVipQosAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVipUsedPorts(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVipUsedPortsAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVipUsedPortsAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVmAttachableDataVolume(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVmAttachableDataVolumeAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVmAttachableDataVolumeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVmAttachableL3Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVmAttachableL3NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVmAttachableL3NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVmBootOrder(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVmBootOrderAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVmBootOrderAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVmCapabilities(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVmCapabilitiesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVmCapabilitiesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVmConsoleAddress(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVmConsoleAddressAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVmConsoleAddressAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVmConsolePassword(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVmConsolePasswordAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVmConsolePasswordAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVmHostname(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVmHostnameAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVmHostnameAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVmInstanceHaLevel(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVmInstanceHaLevelAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVmInstanceHaLevelAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVmMigrationCandidateHosts(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVmMigrationCandidateHostsAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVmMigrationCandidateHostsAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVmMonitorNumber(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVmMonitorNumberAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVmMonitorNumberAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVmQga(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVmQgaAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVmQgaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVmRDP(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVmRDPAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVmRDPAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVmSshKey(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVmSshKeyAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVmSshKeyAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVmStartingCandidateClustersHosts(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVmStartingCandidateClustersHostsAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVmStartingCandidateClustersHostsAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVmUsbRedirect(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVmUsbRedirectAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVmUsbRedirectAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVolumeCapabilities(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVolumeCapabilitiesAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVolumeCapabilitiesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVolumeFormat(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVolumeFormatAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVolumeFormatAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVolumeQos(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVolumeQosAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVolumeQosAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVolumeSnapshotSize(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVolumeSnapshotSizeAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVolumeSnapshotSizeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVpcVRouterDistributedRoutingConnections(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVpcVRouterDistributedRoutingConnectionsAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVpcVRouterDistributedRoutingConnectionsAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVpcVRouterDistributedRoutingEnabled(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVpcVRouterDistributedRoutingEnabledAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVpcVRouterDistributedRoutingEnabledAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVpcVRouterNetworkServiceState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVpcVRouterNetworkServiceStateAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVpcVRouterNetworkServiceStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getVpcVpnConfigurationFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetVpcVpnConfigurationFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.GetVpcVpnConfigurationFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getZone(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.GetZoneAction.class) Closure c) {
        def a = new org.zstack.sdk.GetZoneAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def inspectBaremetalChassis(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.InspectBaremetalChassisAction.class) Closure c) {
        def a = new org.zstack.sdk.InspectBaremetalChassisAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def isOpensourceVersion(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.IsOpensourceVersionAction.class) Closure c) {
        def a = new org.zstack.sdk.IsOpensourceVersionAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def isReadyToGo(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.IsReadyToGoAction.class) Closure c) {
        def a = new org.zstack.sdk.IsReadyToGoAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def kvmRunShell(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.KvmRunShellAction.class) Closure c) {
        def a = new org.zstack.sdk.KvmRunShellAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def localStorageGetVolumeMigratableHosts(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.LocalStorageGetVolumeMigratableHostsAction.class) Closure c) {
        def a = new org.zstack.sdk.LocalStorageGetVolumeMigratableHostsAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def localStorageMigrateVolume(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.LocalStorageMigrateVolumeAction.class) Closure c) {
        def a = new org.zstack.sdk.LocalStorageMigrateVolumeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def logInByAccount(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.LogInByAccountAction.class) Closure c) {
        def a = new org.zstack.sdk.LogInByAccountAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def logInByLdap(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.LogInByLdapAction.class) Closure c) {
        def a = new org.zstack.sdk.LogInByLdapAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def logInByUser(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.LogInByUserAction.class) Closure c) {
        def a = new org.zstack.sdk.LogInByUserAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def logOut(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.LogOutAction.class) Closure c) {
        def a = new org.zstack.sdk.LogOutAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def migrateVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.MigrateVmAction.class) Closure c) {
        def a = new org.zstack.sdk.MigrateVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def pauseVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.PauseVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.PauseVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def powerOffBaremetalChassis(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.PowerOffBaremetalChassisAction.class) Closure c) {
        def a = new org.zstack.sdk.PowerOffBaremetalChassisAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def powerOnBaremetalChassis(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.PowerOnBaremetalChassisAction.class) Closure c) {
        def a = new org.zstack.sdk.PowerOnBaremetalChassisAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def powerResetBaremetalChassis(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.PowerResetBaremetalChassisAction.class) Closure c) {
        def a = new org.zstack.sdk.PowerResetBaremetalChassisAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def previewResourceStack(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.PreviewResourceStackAction.class) Closure c) {
        def a = new org.zstack.sdk.PreviewResourceStackAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def primaryStorageMigrateVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.PrimaryStorageMigrateVmAction.class) Closure c) {
        def a = new org.zstack.sdk.PrimaryStorageMigrateVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def primaryStorageMigrateVolume(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.PrimaryStorageMigrateVolumeAction.class) Closure c) {
        def a = new org.zstack.sdk.PrimaryStorageMigrateVolumeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def prometheusQueryLabelValues(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.PrometheusQueryLabelValuesAction.class) Closure c) {
        def a = new org.zstack.sdk.PrometheusQueryLabelValuesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def prometheusQueryMetadata(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.PrometheusQueryMetadataAction.class) Closure c) {
        def a = new org.zstack.sdk.PrometheusQueryMetadataAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def prometheusQueryPassThrough(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.PrometheusQueryPassThroughAction.class) Closure c) {
        def a = new org.zstack.sdk.PrometheusQueryPassThroughAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def prometheusQueryVmMonitoringData(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.PrometheusQueryVmMonitoringDataAction.class) Closure c) {
        def a = new org.zstack.sdk.PrometheusQueryVmMonitoringDataAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAccessKey(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAccessKeyAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAccessKeyAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAccount(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAccountAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAccountAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAccountResourceRef(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAccountResourceRefAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAccountResourceRefAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAffinityGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAffinityGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAffinityGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAlert(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAlertAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAlertAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAliyunDiskFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAliyunDiskFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAliyunDiskFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAliyunEbsBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAliyunEbsBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAliyunEbsBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAliyunEbsPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAliyunEbsPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAliyunEbsPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAliyunNasAccessGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAliyunNasAccessGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAliyunNasAccessGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAliyunPanguPartition(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAliyunPanguPartitionAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAliyunPanguPartitionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAliyunProxyVSwitch(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAliyunProxyVSwitchAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAliyunProxyVSwitchAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAliyunProxyVpc(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAliyunProxyVpcAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAliyunProxyVpcAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAliyunRouteEntryFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAliyunRouteEntryFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAliyunRouteEntryFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAliyunRouterInterfaceFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAliyunRouterInterfaceFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAliyunRouterInterfaceFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAliyunSnapshotFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAliyunSnapshotFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAliyunSnapshotFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAliyunVirtualRouterFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAliyunVirtualRouterFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAliyunVirtualRouterFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryApplianceVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryApplianceVmAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryApplianceVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAutoScalingGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAutoScalingGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAutoScalingGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAutoScalingGroupActivity(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAutoScalingGroupActivityAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAutoScalingGroupActivityAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAutoScalingGroupInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAutoScalingGroupInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAutoScalingGroupInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAutoScalingRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAutoScalingRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAutoScalingRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAutoScalingRuleTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAutoScalingRuleTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAutoScalingRuleTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAutoScalingVmTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryAutoScalingVmTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryAutoScalingVmTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryBaremetalBonding(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryBaremetalBondingAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryBaremetalBondingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryBaremetalChassis(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryBaremetalChassisAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryBaremetalChassisAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryBaremetalInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryBaremetalInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryBaremetalInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryBaremetalPxeServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryBaremetalPxeServerAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryBaremetalPxeServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryCephBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryCephBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryCephBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryCephPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryCephPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryCephPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryCephPrimaryStoragePool(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryCephPrimaryStoragePoolAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryCephPrimaryStoragePoolAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryCertificate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryCertificateAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryCertificateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryCluster(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryClusterAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryClusterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryConnectionAccessPointFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryConnectionAccessPointFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryConnectionAccessPointFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryConnectionBetweenL3NetworkAndAliyunVSwitch(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryConnectionBetweenL3NetworkAndAliyunVSwitchAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryConnectionBetweenL3NetworkAndAliyunVSwitchAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryConsoleProxyAgent(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryConsoleProxyAgentAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryConsoleProxyAgentAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryDahoCloudConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryDahoCloudConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryDahoCloudConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryDahoDataCenterConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryDahoDataCenterConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryDahoDataCenterConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryDahoVll(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryDahoVllAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryDahoVllAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryDahoVllVbrRef(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryDahoVllVbrRefAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryDahoVllVbrRefAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryDataCenterFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryDataCenterFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryDataCenterFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryDiskOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryDiskOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryDiskOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryEcsImageFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryEcsImageFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryEcsImageFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryEcsInstanceFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryEcsInstanceFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryEcsInstanceFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryEcsSecurityGroupFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryEcsSecurityGroupFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryEcsSecurityGroupFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryEcsSecurityGroupRuleFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryEcsSecurityGroupRuleFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryEcsSecurityGroupRuleFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryEcsVSwitchFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryEcsVSwitchFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryEcsVSwitchFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryEcsVpcFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryEcsVpcFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryEcsVpcFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryEip(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryEipAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryEipAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryEmailMedia(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryEmailMediaAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryEmailMediaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryEmailTriggerAction(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryEmailTriggerActionAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryEmailTriggerActionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryEventFromResourceStack(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryEventFromResourceStackAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryEventFromResourceStackAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryFiberChannelLun(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryFiberChannelLunAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryFiberChannelLunAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryFiberChannelStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryFiberChannelStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryFiberChannelStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryFusionstorBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryFusionstorBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryFusionstorBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryFusionstorPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryFusionstorPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryFusionstorPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryGCJob(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryGCJobAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryGCJobAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryGlobalConfig(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryGlobalConfigAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryGlobalConfigAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryHost(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryHostAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryHostAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryHybridEipFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryHybridEipFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryHybridEipFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryHybridKeySecret(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryHybridKeySecretAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryHybridKeySecretAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryIPSecConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryIPSecConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryIPSecConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryIdentityZoneFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryIdentityZoneFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryIdentityZoneFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryImage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryImageAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryImageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryImageCache(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryImageCacheAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryImageCacheAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryImageStoreBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryImageStoreBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryImageStoreBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryInstanceOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryInstanceOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryInstanceOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryIpAddress(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryIpAddressAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryIpAddressAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryIpRange(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryIpRangeAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryIpRangeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryIscsiLun(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryIscsiLunAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryIscsiLunAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryIscsiServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryIscsiServerAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryIscsiServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryL2Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryL2NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryL2NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryL2VlanNetwork(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryL2VlanNetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryL2VlanNetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryL2VxlanNetwork(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryL2VxlanNetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryL2VxlanNetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryL2VxlanNetworkPool(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryL2VxlanNetworkPoolAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryL2VxlanNetworkPoolAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryL3Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryL3NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryL3NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryLdapBinding(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryLdapBindingAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryLdapBindingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryLdapServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryLdapServerAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryLdapServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryLoadBalancer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryLoadBalancerAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryLoadBalancerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryLoadBalancerListener(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryLoadBalancerListenerAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryLoadBalancerListenerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryLocalStorageResourceRef(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryLocalStorageResourceRefAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryLocalStorageResourceRefAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryLongJob(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryLongJobAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryLongJobAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryManagementNode(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryManagementNodeAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryManagementNodeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryMedia(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryMediaAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryMediaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryMonitorTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryMonitorTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryMonitorTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryMonitorTriggerAction(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryMonitorTriggerActionAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryMonitorTriggerActionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryNasFileSystem(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryNasFileSystemAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryNasFileSystemAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryNasMountTarget(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryNasMountTargetAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryNasMountTargetAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryNetworkServiceL3NetworkRef(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryNetworkServiceL3NetworkRefAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryNetworkServiceL3NetworkRefAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryNetworkServiceProvider(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryNetworkServiceProviderAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryNetworkServiceProviderAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryOssBucketFileName(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryOssBucketFileNameAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryOssBucketFileNameAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryPciDevice(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryPciDeviceAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryPciDeviceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryPciDeviceOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryPciDeviceOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryPciDeviceOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryPciDevicePciDeviceOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryPciDevicePciDeviceOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryPciDevicePciDeviceOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryPciDeviceSpec(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryPciDeviceSpecAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryPciDeviceSpecAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryPolicy(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryPolicyAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryPolicyAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryPortForwardingRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryPortForwardingRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryPortForwardingRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryPreconfigurationTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryPreconfigurationTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryPreconfigurationTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryQuota(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryQuotaAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryQuotaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryResourceConfig(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryResourceConfigAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryResourceConfigAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryResourcePrice(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryResourcePriceAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryResourcePriceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryResourceStack(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryResourceStackAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryResourceStackAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySchedulerJob(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QuerySchedulerJobAction.class) Closure c) {
        def a = new org.zstack.sdk.QuerySchedulerJobAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySchedulerJobGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QuerySchedulerJobGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.QuerySchedulerJobGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySchedulerTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QuerySchedulerTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.QuerySchedulerTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryScsiLun(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryScsiLunAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryScsiLunAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySecurityGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QuerySecurityGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.QuerySecurityGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySecurityGroupRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QuerySecurityGroupRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.QuerySecurityGroupRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySftpBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QuerySftpBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.QuerySftpBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryShareableVolumeVmInstanceRef(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryShareableVolumeVmInstanceRefAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryShareableVolumeVmInstanceRefAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySharedBlock(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QuerySharedBlockAction.class) Closure c) {
        def a = new org.zstack.sdk.QuerySharedBlockAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySharedBlockGroupPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QuerySharedBlockGroupPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.QuerySharedBlockGroupPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySharedBlockGroupPrimaryStorageHostRef(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QuerySharedBlockGroupPrimaryStorageHostRefAction.class) Closure c) {
        def a = new org.zstack.sdk.QuerySharedBlockGroupPrimaryStorageHostRefAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySharedResource(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QuerySharedResourceAction.class) Closure c) {
        def a = new org.zstack.sdk.QuerySharedResourceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryStackTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryStackTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryStackTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySystemTag(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QuerySystemTagAction.class) Closure c) {
        def a = new org.zstack.sdk.QuerySystemTagAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryTag(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryTagAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryTagAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryTwoFactorAuthentication(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryTwoFactorAuthenticationAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryTwoFactorAuthenticationAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryUsbDevice(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryUsbDeviceAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryUsbDeviceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryUser(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryUserAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryUserAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryUserGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryUserGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryUserGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryUserTag(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryUserTagAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryUserTagAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryV2VConversionHost(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryV2VConversionHostAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryV2VConversionHostAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVCenter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVCenterAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVCenterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVCenterBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVCenterBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVCenterBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVCenterCluster(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVCenterClusterAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVCenterClusterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVCenterDatacenter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVCenterDatacenterAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVCenterDatacenterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVCenterPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVCenterPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVCenterPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVCenterResourcePool(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVCenterResourcePoolAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVCenterResourcePoolAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVRouterOspfArea(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVRouterOspfAreaAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVRouterOspfAreaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVRouterOspfNetwork(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVRouterOspfNetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVRouterOspfNetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVRouterRouteEntry(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVRouterRouteEntryAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVRouterRouteEntryAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVRouterRouteTable(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVRouterRouteTableAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVRouterRouteTableAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVip(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVipAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVipAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVirtualBorderRouterFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVirtualBorderRouterFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVirtualBorderRouterFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVirtualRouterOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVirtualRouterOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVirtualRouterOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVirtualRouterVRouterRouteTableRef(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVirtualRouterVRouterRouteTableRefAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVirtualRouterVRouterRouteTableRefAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVirtualRouterVm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVirtualRouterVmAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVirtualRouterVmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVmCdRom(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVmCdRomAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVmCdRomAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVmNic(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVmNicAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVmNicAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVmNicInSecurityGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVmNicInSecurityGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVmNicInSecurityGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVniRange(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVniRangeAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVniRangeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVolume(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVolumeAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVolumeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVolumeSnapshot(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVolumeSnapshotAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVolumeSnapshotAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVolumeSnapshotTree(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVolumeSnapshotTreeAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVolumeSnapshotTreeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVpcIkeConfigFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVpcIkeConfigFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVpcIkeConfigFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVpcIpSecConfigFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVpcIpSecConfigFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVpcIpSecConfigFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVpcRouter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVpcRouterAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVpcRouterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVpcUserVpnGatewayFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVpcUserVpnGatewayFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVpcUserVpnGatewayFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVpcVpnConnectionFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVpcVpnConnectionFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVpcVpnConnectionFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVpcVpnGatewayFromLocal(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVpcVpnGatewayFromLocalAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVpcVpnGatewayFromLocalAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryVtep(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryVtepAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryVtepAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryWebhook(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryWebhookAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryWebhookAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryZone(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.QueryZoneAction.class) Closure c) {
        def a = new org.zstack.sdk.QueryZoneAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def rebootBaremetalInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RebootBaremetalInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.RebootBaremetalInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def rebootEcsInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RebootEcsInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.RebootEcsInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def rebootVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RebootVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.RebootVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def reclaimSpaceFromImageStore(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ReclaimSpaceFromImageStoreAction.class) Closure c) {
        def a = new org.zstack.sdk.ReclaimSpaceFromImageStoreAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def reconnectBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ReconnectBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.ReconnectBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def reconnectBaremetalPxeServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ReconnectBaremetalPxeServerAction.class) Closure c) {
        def a = new org.zstack.sdk.ReconnectBaremetalPxeServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def reconnectConsoleProxyAgent(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ReconnectConsoleProxyAgentAction.class) Closure c) {
        def a = new org.zstack.sdk.ReconnectConsoleProxyAgentAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def reconnectHost(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ReconnectHostAction.class) Closure c) {
        def a = new org.zstack.sdk.ReconnectHostAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def reconnectImageStoreBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ReconnectImageStoreBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.ReconnectImageStoreBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def reconnectPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ReconnectPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.ReconnectPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def reconnectSftpBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ReconnectSftpBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.ReconnectSftpBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def reconnectVirtualRouter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ReconnectVirtualRouterAction.class) Closure c) {
        def a = new org.zstack.sdk.ReconnectVirtualRouterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def recoverBaremetalInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RecoverBaremetalInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.RecoverBaremetalInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def recoverDataVolume(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RecoverDataVolumeAction.class) Closure c) {
        def a = new org.zstack.sdk.RecoverDataVolumeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def recoverImage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RecoverImageAction.class) Closure c) {
        def a = new org.zstack.sdk.RecoverImageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def recoverVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RecoverVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.RecoverVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def recoveryImageFromImageStoreBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RecoveryImageFromImageStoreBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.RecoveryImageFromImageStoreBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def recoveryVirtualBorderRouterRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RecoveryVirtualBorderRouterRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.RecoveryVirtualBorderRouterRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def refreshCaptcha(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RefreshCaptchaAction.class) Closure c) {
        def a = new org.zstack.sdk.RefreshCaptchaAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def refreshFiberChannelStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RefreshFiberChannelStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.RefreshFiberChannelStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def refreshIscsiServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RefreshIscsiServerAction.class) Closure c) {
        def a = new org.zstack.sdk.RefreshIscsiServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def refreshLoadBalancer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RefreshLoadBalancerAction.class) Closure c) {
        def a = new org.zstack.sdk.RefreshLoadBalancerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def refreshSharedblockDeviceCapacity(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RefreshSharedblockDeviceCapacityAction.class) Closure c) {
        def a = new org.zstack.sdk.RefreshSharedblockDeviceCapacityAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def reimageVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ReimageVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.ReimageVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def reloadElaboration(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ReloadElaborationAction.class) Closure c) {
        def a = new org.zstack.sdk.ReloadElaborationAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def reloadLicense(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ReloadLicenseAction.class) Closure c) {
        def a = new org.zstack.sdk.ReloadLicenseAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeCertificateFromLoadBalancerListener(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveCertificateFromLoadBalancerListenerAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveCertificateFromLoadBalancerListenerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeDnsFromL3Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveDnsFromL3NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveDnsFromL3NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeDnsFromVpcRouter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveDnsFromVpcRouterAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveDnsFromVpcRouterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeHostRouteFromL3Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveHostRouteFromL3NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveHostRouteFromL3NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeMonFromCephBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveMonFromCephBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveMonFromCephBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeMonFromCephPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveMonFromCephPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveMonFromCephPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeMonFromFusionstorBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveMonFromFusionstorBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveMonFromFusionstorBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeMonFromFusionstorPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveMonFromFusionstorPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveMonFromFusionstorPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeRemoteCidrsFromIPsecConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveRemoteCidrsFromIPsecConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveRemoteCidrsFromIPsecConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeSchedulerJobFromSchedulerTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveSchedulerJobFromSchedulerTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveSchedulerJobFromSchedulerTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeSchedulerJobGroupFromSchedulerTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveSchedulerJobGroupFromSchedulerTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveSchedulerJobGroupFromSchedulerTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeSchedulerJobsFromSchedulerJobGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveSchedulerJobsFromSchedulerJobGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveSchedulerJobsFromSchedulerJobGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeUserFromGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveUserFromGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveUserFromGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeVRouterNetworksFromOspfArea(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveVRouterNetworksFromOspfAreaAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveVRouterNetworksFromOspfAreaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeVmFromAffinityGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveVmFromAffinityGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveVmFromAffinityGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeVmNicFromLoadBalancer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RemoveVmNicFromLoadBalancerAction.class) Closure c) {
        def a = new org.zstack.sdk.RemoveVmNicFromLoadBalancerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def renewSession(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RenewSessionAction.class) Closure c) {
        def a = new org.zstack.sdk.RenewSessionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def requestConsoleAccess(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RequestConsoleAccessAction.class) Closure c) {
        def a = new org.zstack.sdk.RequestConsoleAccessAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def rerunLongJob(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RerunLongJobAction.class) Closure c) {
        def a = new org.zstack.sdk.RerunLongJobAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def resetGlobalConfig(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ResetGlobalConfigAction.class) Closure c) {
        def a = new org.zstack.sdk.ResetGlobalConfigAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def resizeDataVolume(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ResizeDataVolumeAction.class) Closure c) {
        def a = new org.zstack.sdk.ResizeDataVolumeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def resizeRootVolume(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ResizeRootVolumeAction.class) Closure c) {
        def a = new org.zstack.sdk.ResizeRootVolumeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def restartResourceStack(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RestartResourceStackAction.class) Closure c) {
        def a = new org.zstack.sdk.RestartResourceStackAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def resumeVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ResumeVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.ResumeVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def revertVolumeFromSnapshot(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RevertVolumeFromSnapshotAction.class) Closure c) {
        def a = new org.zstack.sdk.RevertVolumeFromSnapshotAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def revokeResourceSharing(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RevokeResourceSharingAction.class) Closure c) {
        def a = new org.zstack.sdk.RevokeResourceSharingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def runSchedulerTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.RunSchedulerTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.RunSchedulerTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setImageQga(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetImageQgaAction.class) Closure c) {
        def a = new org.zstack.sdk.SetImageQgaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setL3NetworkMtu(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetL3NetworkMtuAction.class) Closure c) {
        def a = new org.zstack.sdk.SetL3NetworkMtuAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setL3NetworkRouterInterfaceIp(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetL3NetworkRouterInterfaceIpAction.class) Closure c) {
        def a = new org.zstack.sdk.SetL3NetworkRouterInterfaceIpAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setNicQos(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetNicQosAction.class) Closure c) {
        def a = new org.zstack.sdk.SetNicQosAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVRouterRouterId(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVRouterRouterIdAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVRouterRouterIdAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVipQos(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVipQosAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVipQosAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVmBootMode(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVmBootModeAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVmBootModeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVmBootOrder(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVmBootOrderAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVmBootOrderAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVmCleanTraffic(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVmCleanTrafficAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVmCleanTrafficAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVmConsolePassword(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVmConsolePasswordAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVmConsolePasswordAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVmHostname(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVmHostnameAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVmHostnameAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVmInstanceDefaultCdRom(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVmInstanceDefaultCdRomAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVmInstanceDefaultCdRomAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVmInstanceHaLevel(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVmInstanceHaLevelAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVmInstanceHaLevelAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVmMonitorNumber(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVmMonitorNumberAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVmMonitorNumberAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVmQga(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVmQgaAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVmQgaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVmRDP(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVmRDPAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVmRDPAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVmSshKey(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVmSshKeyAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVmSshKeyAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVmStaticIp(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVmStaticIpAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVmStaticIpAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVmUsbRedirect(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVmUsbRedirectAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVmUsbRedirectAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVolumeQos(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVolumeQosAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVolumeQosAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVpcVRouterDistributedRoutingEnabled(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVpcVRouterDistributedRoutingEnabledAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVpcVRouterDistributedRoutingEnabledAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def setVpcVRouterNetworkServiceState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SetVpcVRouterNetworkServiceStateAction.class) Closure c) {
        def a = new org.zstack.sdk.SetVpcVRouterNetworkServiceStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def shareResource(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ShareResourceAction.class) Closure c) {
        def a = new org.zstack.sdk.ShareResourceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def startBaremetalInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.StartBaremetalInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.StartBaremetalInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def startBaremetalPxeServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.StartBaremetalPxeServerAction.class) Closure c) {
        def a = new org.zstack.sdk.StartBaremetalPxeServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def startConnectionBetweenAliyunRouterInterface(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.StartConnectionBetweenAliyunRouterInterfaceAction.class) Closure c) {
        def a = new org.zstack.sdk.StartConnectionBetweenAliyunRouterInterfaceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def startEcsInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.StartEcsInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.StartEcsInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def startVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.StartVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.StartVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def stopBaremetalInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.StopBaremetalInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.StopBaremetalInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def stopBaremetalPxeServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.StopBaremetalPxeServerAction.class) Closure c) {
        def a = new org.zstack.sdk.StopBaremetalPxeServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def stopEcsInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.StopEcsInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.StopEcsInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def stopVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.StopVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.StopVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def submitLongJob(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SubmitLongJobAction.class) Closure c) {
        def a = new org.zstack.sdk.SubmitLongJobAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncAliyunRouteEntryFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncAliyunRouteEntryFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncAliyunRouteEntryFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncAliyunRouterInterfaceFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncAliyunRouterInterfaceFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncAliyunRouterInterfaceFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncAliyunSnapshotRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncAliyunSnapshotRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncAliyunSnapshotRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncAliyunVirtualRouterFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncAliyunVirtualRouterFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncAliyunVirtualRouterFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncConnectionAccessPointFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncConnectionAccessPointFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncConnectionAccessPointFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncDahoCloudConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncDahoCloudConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncDahoCloudConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncDahoDataCenterConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncDahoDataCenterConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncDahoDataCenterConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncDahoVll(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncDahoVllAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncDahoVllAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncDataCenterFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncDataCenterFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncDataCenterFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncDiskFromAliyunFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncDiskFromAliyunFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncDiskFromAliyunFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncEcsImageFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncEcsImageFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncEcsImageFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncEcsInstanceFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncEcsInstanceFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncEcsInstanceFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncEcsSecurityGroupFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncEcsSecurityGroupFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncEcsSecurityGroupFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncEcsSecurityGroupRuleFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncEcsSecurityGroupRuleFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncEcsSecurityGroupRuleFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncEcsVSwitchFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncEcsVSwitchFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncEcsVSwitchFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncEcsVpcFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncEcsVpcFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncEcsVpcFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncHybridEipFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncHybridEipFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncHybridEipFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncIdentityFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncIdentityFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncIdentityFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncImageFromImageStoreBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncImageFromImageStoreBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncImageFromImageStoreBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncImageSize(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncImageSizeAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncImageSizeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncPrimaryStorageCapacity(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncPrimaryStorageCapacityAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncPrimaryStorageCapacityAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncVCenter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncVCenterAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncVCenterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncVirtualBorderRouterFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncVirtualBorderRouterFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncVirtualBorderRouterFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncVolumeSize(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncVolumeSizeAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncVolumeSizeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncVpcUserVpnGatewayFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncVpcUserVpnGatewayFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncVpcUserVpnGatewayFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncVpcVpnConnectionFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncVpcVpnConnectionFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncVpcVpnConnectionFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncVpcVpnGatewayFromRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.SyncVpcVpnGatewayFromRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.SyncVpcVpnGatewayFromRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def terminateVirtualBorderRouterRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.TerminateVirtualBorderRouterRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.TerminateVirtualBorderRouterRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def triggerGCJob(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.TriggerGCJobAction.class) Closure c) {
        def a = new org.zstack.sdk.TriggerGCJobAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAccount(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAccountAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAccountAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAffinityGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAffinityGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAffinityGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAliyunDisk(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAliyunDiskAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAliyunDiskAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAliyunEbsBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAliyunEbsBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAliyunEbsBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAliyunEbsPrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAliyunEbsPrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAliyunEbsPrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAliyunKeySecret(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAliyunKeySecretAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAliyunKeySecretAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAliyunMountTarget(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAliyunMountTargetAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAliyunMountTargetAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAliyunNasAccessGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAliyunNasAccessGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAliyunNasAccessGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAliyunPanguPartition(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAliyunPanguPartitionAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAliyunPanguPartitionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAliyunRouteInterfaceRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAliyunRouteInterfaceRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAliyunRouteInterfaceRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAliyunSnapshot(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAliyunSnapshotAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAliyunSnapshotAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAliyunVirtualRouter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAliyunVirtualRouterAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAliyunVirtualRouterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAutoScalingGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAutoScalingGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAutoScalingGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAutoScalingGroupAddingNewInstanceRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAutoScalingGroupAddingNewInstanceRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAutoScalingGroupAddingNewInstanceRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAutoScalingGroupRemovalInstanceRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAutoScalingGroupRemovalInstanceRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAutoScalingGroupRemovalInstanceRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAutoScalingRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateAutoScalingRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateAutoScalingRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateBaremetalChassis(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateBaremetalChassisAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateBaremetalChassisAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateBaremetalInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateBaremetalInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateBaremetalInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateBaremetalPxeServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateBaremetalPxeServerAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateBaremetalPxeServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateCephBackupStorageMon(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateCephBackupStorageMonAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateCephBackupStorageMonAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateCephPrimaryStorageMon(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateCephPrimaryStorageMonAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateCephPrimaryStorageMonAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateCephPrimaryStoragePool(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateCephPrimaryStoragePoolAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateCephPrimaryStoragePoolAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateCertificate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateCertificateAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateCertificateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateCluster(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateClusterAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateClusterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateClusterOS(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateClusterOSAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateClusterOSAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateConnectionBetweenL3NetWorkAndAliyunVSwitch(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateConnectionBetweenL3NetWorkAndAliyunVSwitchAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateConnectionBetweenL3NetWorkAndAliyunVSwitchAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateConsoleProxyAgent(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateConsoleProxyAgentAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateConsoleProxyAgentAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateDahoCloudConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateDahoCloudConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateDahoCloudConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateDahoDataCenterConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateDahoDataCenterConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateDahoDataCenterConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateDahoVll(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateDahoVllAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateDahoVllAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateDiskOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateDiskOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateDiskOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateEcsImage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateEcsImageAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateEcsImageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateEcsInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateEcsInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateEcsInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateEcsInstanceVncPassword(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateEcsInstanceVncPasswordAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateEcsInstanceVncPasswordAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateEcsSecurityGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateEcsSecurityGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateEcsSecurityGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateEcsVSwitch(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateEcsVSwitchAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateEcsVSwitchAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateEcsVpc(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateEcsVpcAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateEcsVpcAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateEip(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateEipAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateEipAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateEmailMedia(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateEmailMediaAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateEmailMediaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateEmailMonitorTriggerAction(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateEmailMonitorTriggerActionAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateEmailMonitorTriggerActionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateFusionstorBackupStorageMon(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateFusionstorBackupStorageMonAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateFusionstorBackupStorageMonAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateFusionstorPrimaryStorageMon(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateFusionstorPrimaryStorageMonAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateFusionstorPrimaryStorageMonAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateGlobalConfig(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateGlobalConfigAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateGlobalConfigAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateHost(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateHostAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateHostAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateHostIommuState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateHostIommuStateAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateHostIommuStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateHybridEip(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateHybridEipAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateHybridEipAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateHybridKeySecret(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateHybridKeySecretAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateHybridKeySecretAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateIPsecConnection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateIPsecConnectionAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateIPsecConnectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateImage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateImageAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateImageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateImageStoreBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateImageStoreBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateImageStoreBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateInstanceOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateInstanceOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateInstanceOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateIpRange(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateIpRangeAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateIpRangeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateIscsiServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateIscsiServerAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateIscsiServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateKVMHost(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateKVMHostAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateKVMHostAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateL2Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateL2NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateL2NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateL3Network(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateL3NetworkAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateL3NetworkAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateLdapServer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateLdapServerAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateLdapServerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateLicense(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateLicenseAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateLicenseAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateLoadBalancer(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateLoadBalancerAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateLoadBalancerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateLoadBalancerListener(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateLoadBalancerListenerAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateLoadBalancerListenerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateMonitorTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateMonitorTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateMonitorTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateNasFileSystem(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateNasFileSystemAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateNasFileSystemAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateNasMountTarget(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateNasMountTargetAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateNasMountTargetAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateOssBucket(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateOssBucketAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateOssBucketAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updatePciDevice(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdatePciDeviceAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdatePciDeviceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updatePciDeviceSpec(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdatePciDeviceSpecAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdatePciDeviceSpecAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updatePortForwardingRule(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdatePortForwardingRuleAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdatePortForwardingRuleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updatePreconfigurationTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdatePreconfigurationTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdatePreconfigurationTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updatePrimaryStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdatePrimaryStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdatePrimaryStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateQuota(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateQuotaAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateQuotaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateResourceConfig(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateResourceConfigAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateResourceConfigAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateResourceStack(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateResourceStackAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateResourceStackAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateSchedulerJob(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateSchedulerJobAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateSchedulerJobAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateSchedulerJobGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateSchedulerJobGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateSchedulerJobGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateSchedulerTrigger(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateSchedulerTriggerAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateSchedulerTriggerAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateScsiLun(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateScsiLunAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateScsiLunAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateSecurityGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateSecurityGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateSecurityGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateSftpBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateSftpBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateSftpBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateStackTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateStackTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateStackTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateSystemTag(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateSystemTagAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateSystemTagAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateTag(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateTagAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateTagAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateUsbDevice(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateUsbDeviceAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateUsbDeviceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateUser(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateUserAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateUserAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateUserGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateUserGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateUserGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateV2VConversionHost(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateV2VConversionHostAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateV2VConversionHostAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateVCenter(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateVCenterAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateVCenterAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateVRouterOspfArea(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateVRouterOspfAreaAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateVRouterOspfAreaAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateVRouterRouteTable(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateVRouterRouteTableAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateVRouterRouteTableAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateVip(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateVipAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateVipAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateVirtualBorderRouterRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateVirtualBorderRouterRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateVirtualBorderRouterRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateVirtualRouterOffering(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateVirtualRouterOfferingAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateVirtualRouterOfferingAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateVmCdRom(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateVmCdRomAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateVmCdRomAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateVmInstance(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateVmInstanceAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateVmInstanceAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateVmNicMac(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateVmNicMacAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateVmNicMacAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateVniRange(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateVniRangeAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateVniRangeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateVolume(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateVolumeAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateVolumeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateVolumeSnapshot(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateVolumeSnapshotAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateVolumeSnapshotAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateVpcUserVpnGateway(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateVpcUserVpnGatewayAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateVpcUserVpnGatewayAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateVpcVpnConnectionRemote(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateVpcVpnConnectionRemoteAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateVpcVpnConnectionRemoteAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateVpcVpnGateway(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateVpcVpnGatewayAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateVpcVpnGatewayAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateWebhook(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateWebhookAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateWebhookAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateZone(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.UpdateZoneAction.class) Closure c) {
        def a = new org.zstack.sdk.UpdateZoneAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def validateDiskOfferingUserConfig(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ValidateDiskOfferingUserConfigAction.class) Closure c) {
        def a = new org.zstack.sdk.ValidateDiskOfferingUserConfigAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def validateInstanceOfferingUserConfig(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ValidateInstanceOfferingUserConfigAction.class) Closure c) {
        def a = new org.zstack.sdk.ValidateInstanceOfferingUserConfigAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def validatePriceUserConfig(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ValidatePriceUserConfigAction.class) Closure c) {
        def a = new org.zstack.sdk.ValidatePriceUserConfigAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def validateSession(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ValidateSessionAction.class) Closure c) {
        def a = new org.zstack.sdk.ValidateSessionAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def zQLQuery(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ZQLQueryAction.class) Closure c) {
        def a = new org.zstack.sdk.ZQLQueryAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createDatabaseBackup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.databasebackup.CreateDatabaseBackupAction.class) Closure c) {
        def a = new org.zstack.sdk.databasebackup.CreateDatabaseBackupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteDatabaseBackup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.databasebackup.DeleteDatabaseBackupAction.class) Closure c) {
        def a = new org.zstack.sdk.databasebackup.DeleteDatabaseBackupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteExportedDatabaseBackupFromBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.databasebackup.DeleteExportedDatabaseBackupFromBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.databasebackup.DeleteExportedDatabaseBackupFromBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def exportDatabaseBackupFromBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.databasebackup.ExportDatabaseBackupFromBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.databasebackup.ExportDatabaseBackupFromBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getDatabaseBackupFromImageStore(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.databasebackup.GetDatabaseBackupFromImageStoreAction.class) Closure c) {
        def a = new org.zstack.sdk.databasebackup.GetDatabaseBackupFromImageStoreAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryDatabaseBackup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.databasebackup.QueryDatabaseBackupAction.class) Closure c) {
        def a = new org.zstack.sdk.databasebackup.QueryDatabaseBackupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def recoverDatabaseFromBackup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.databasebackup.RecoverDatabaseFromBackupAction.class) Closure c) {
        def a = new org.zstack.sdk.databasebackup.RecoverDatabaseFromBackupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncDatabaseBackup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.databasebackup.SyncDatabaseBackupAction.class) Closure c) {
        def a = new org.zstack.sdk.databasebackup.SyncDatabaseBackupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def syncDatabaseBackupFromImageStoreBackupStorage(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.databasebackup.SyncDatabaseBackupFromImageStoreBackupStorageAction.class) Closure c) {
        def a = new org.zstack.sdk.databasebackup.SyncDatabaseBackupFromImageStoreBackupStorageAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addAttributesToIAM2Organization(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.AddAttributesToIAM2OrganizationAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.AddAttributesToIAM2OrganizationAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addAttributesToIAM2Project(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.AddAttributesToIAM2ProjectAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.AddAttributesToIAM2ProjectAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addAttributesToIAM2VirtualID(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.AddAttributesToIAM2VirtualIDAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.AddAttributesToIAM2VirtualIDAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addAttributesToIAM2VirtualIDGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.AddAttributesToIAM2VirtualIDGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.AddAttributesToIAM2VirtualIDGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addIAM2VirtualIDsToGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.AddIAM2VirtualIDsToGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.AddIAM2VirtualIDsToGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addIAM2VirtualIDsToOrganization(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.AddIAM2VirtualIDsToOrganizationAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.AddIAM2VirtualIDsToOrganizationAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addIAM2VirtualIDsToProject(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.AddIAM2VirtualIDsToProjectAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.AddIAM2VirtualIDsToProjectAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addRolesToIAM2VirtualID(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.AddRolesToIAM2VirtualIDAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.AddRolesToIAM2VirtualIDAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addRolesToIAM2VirtualIDGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.AddRolesToIAM2VirtualIDGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.AddRolesToIAM2VirtualIDGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeIAM2OrganizationParent(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.ChangeIAM2OrganizationParentAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.ChangeIAM2OrganizationParentAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeIAM2OrganizationState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.ChangeIAM2OrganizationStateAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.ChangeIAM2OrganizationStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeIAM2ProjectState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.ChangeIAM2ProjectStateAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.ChangeIAM2ProjectStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeIAM2VirtualIDGroupState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.ChangeIAM2VirtualIDGroupStateAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.ChangeIAM2VirtualIDGroupStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeIAM2VirtualIDState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.ChangeIAM2VirtualIDStateAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.ChangeIAM2VirtualIDStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createIAM2Organization(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.CreateIAM2OrganizationAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.CreateIAM2OrganizationAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createIAM2Project(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.CreateIAM2ProjectAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.CreateIAM2ProjectAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createIAM2ProjectFromTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.CreateIAM2ProjectFromTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.CreateIAM2ProjectFromTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createIAM2ProjectTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.CreateIAM2ProjectTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.CreateIAM2ProjectTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createIAM2ProjectTemplateFromProject(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.CreateIAM2ProjectTemplateFromProjectAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.CreateIAM2ProjectTemplateFromProjectAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createIAM2VirtualID(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.CreateIAM2VirtualIDAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.CreateIAM2VirtualIDAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createIAM2VirtualIDGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.CreateIAM2VirtualIDGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.CreateIAM2VirtualIDGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteIAM2Organization(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.DeleteIAM2OrganizationAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.DeleteIAM2OrganizationAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteIAM2Project(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.DeleteIAM2ProjectAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.DeleteIAM2ProjectAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteIAM2ProjectTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.DeleteIAM2ProjectTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.DeleteIAM2ProjectTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteIAM2VirtualID(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.DeleteIAM2VirtualIDAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.DeleteIAM2VirtualIDAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteIAM2VirtualIDGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.DeleteIAM2VirtualIDGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.DeleteIAM2VirtualIDGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def expungeIAM2Project(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.ExpungeIAM2ProjectAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.ExpungeIAM2ProjectAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getIAM2ProjectsOfVirtualID(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.GetIAM2ProjectsOfVirtualIDAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.GetIAM2ProjectsOfVirtualIDAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getIAM2SystemAttributes(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.GetIAM2SystemAttributesAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.GetIAM2SystemAttributesAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getIAM2VirtualIDAPIPermission(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.GetIAM2VirtualIDAPIPermissionAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.GetIAM2VirtualIDAPIPermissionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def loginIAM2Project(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.LoginIAM2ProjectAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.LoginIAM2ProjectAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def loginIAM2VirtualID(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.LoginIAM2VirtualIDAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.LoginIAM2VirtualIDAction()
        
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryIAM2Organization(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.QueryIAM2OrganizationAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.QueryIAM2OrganizationAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryIAM2OrganizationAttribute(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.QueryIAM2OrganizationAttributeAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.QueryIAM2OrganizationAttributeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryIAM2Project(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.QueryIAM2ProjectAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.QueryIAM2ProjectAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryIAM2ProjectAttribute(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.QueryIAM2ProjectAttributeAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.QueryIAM2ProjectAttributeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryIAM2ProjectTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.QueryIAM2ProjectTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.QueryIAM2ProjectTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryIAM2VirtualID(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.QueryIAM2VirtualIDAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.QueryIAM2VirtualIDAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryIAM2VirtualIDAttribute(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.QueryIAM2VirtualIDAttributeAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.QueryIAM2VirtualIDAttributeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryIAM2VirtualIDGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.QueryIAM2VirtualIDGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.QueryIAM2VirtualIDGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryIAM2VirtualIDGroupAttribute(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.QueryIAM2VirtualIDGroupAttributeAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.QueryIAM2VirtualIDGroupAttributeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def recoverIAM2Project(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.RecoverIAM2ProjectAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.RecoverIAM2ProjectAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeAttributesFromIAM2Organization(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.RemoveAttributesFromIAM2OrganizationAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.RemoveAttributesFromIAM2OrganizationAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeAttributesFromIAM2Project(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.RemoveAttributesFromIAM2ProjectAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.RemoveAttributesFromIAM2ProjectAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeAttributesFromIAM2VirtualID(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.RemoveAttributesFromIAM2VirtualIDAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.RemoveAttributesFromIAM2VirtualIDAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeAttributesFromIAM2VirtualIDGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.RemoveAttributesFromIAM2VirtualIDGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.RemoveAttributesFromIAM2VirtualIDGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeIAM2VirtualIDsFromGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.RemoveIAM2VirtualIDsFromGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.RemoveIAM2VirtualIDsFromGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeIAM2VirtualIDsFromOrganization(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.RemoveIAM2VirtualIDsFromOrganizationAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.RemoveIAM2VirtualIDsFromOrganizationAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeIAM2VirtualIDsFromProject(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.RemoveIAM2VirtualIDsFromProjectAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.RemoveIAM2VirtualIDsFromProjectAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeRolesFromIAM2VirtualID(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.RemoveRolesFromIAM2VirtualIDAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.RemoveRolesFromIAM2VirtualIDAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeRolesFromIAM2VirtualIDGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.RemoveRolesFromIAM2VirtualIDGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.RemoveRolesFromIAM2VirtualIDGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def stopAllResourcesInIAM2Project(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.StopAllResourcesInIAM2ProjectAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.StopAllResourcesInIAM2ProjectAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateIAM2Organization(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.UpdateIAM2OrganizationAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.UpdateIAM2OrganizationAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateIAM2OrganizationAttribute(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.UpdateIAM2OrganizationAttributeAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.UpdateIAM2OrganizationAttributeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateIAM2Project(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.UpdateIAM2ProjectAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.UpdateIAM2ProjectAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateIAM2ProjectAttribute(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.UpdateIAM2ProjectAttributeAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.UpdateIAM2ProjectAttributeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateIAM2ProjectTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.UpdateIAM2ProjectTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.UpdateIAM2ProjectTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateIAM2VirtualID(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.UpdateIAM2VirtualIDAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.UpdateIAM2VirtualIDAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateIAM2VirtualIDAttribute(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.UpdateIAM2VirtualIDAttributeAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.UpdateIAM2VirtualIDAttributeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateIAM2VirtualIDGroup(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.UpdateIAM2VirtualIDGroupAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.UpdateIAM2VirtualIDGroupAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateIAM2VirtualIDGroupAttribute(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.iam2.api.UpdateIAM2VirtualIDGroupAttributeAction.class) Closure c) {
        def a = new org.zstack.sdk.iam2.api.UpdateIAM2VirtualIDGroupAttributeAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addPolicyStatementsToRole(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.identity.role.api.AddPolicyStatementsToRoleAction.class) Closure c) {
        def a = new org.zstack.sdk.identity.role.api.AddPolicyStatementsToRoleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachPolicyToRole(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.identity.role.api.AttachPolicyToRoleAction.class) Closure c) {
        def a = new org.zstack.sdk.identity.role.api.AttachPolicyToRoleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def attachRoleToAccount(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.identity.role.api.AttachRoleToAccountAction.class) Closure c) {
        def a = new org.zstack.sdk.identity.role.api.AttachRoleToAccountAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeRoleState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.identity.role.api.ChangeRoleStateAction.class) Closure c) {
        def a = new org.zstack.sdk.identity.role.api.ChangeRoleStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createRole(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.identity.role.api.CreateRoleAction.class) Closure c) {
        def a = new org.zstack.sdk.identity.role.api.CreateRoleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteRole(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.identity.role.api.DeleteRoleAction.class) Closure c) {
        def a = new org.zstack.sdk.identity.role.api.DeleteRoleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachPolicyFromRole(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.identity.role.api.DetachPolicyFromRoleAction.class) Closure c) {
        def a = new org.zstack.sdk.identity.role.api.DetachPolicyFromRoleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def detachRoleFromAccount(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.identity.role.api.DetachRoleFromAccountAction.class) Closure c) {
        def a = new org.zstack.sdk.identity.role.api.DetachRoleFromAccountAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryRole(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.identity.role.api.QueryRoleAction.class) Closure c) {
        def a = new org.zstack.sdk.identity.role.api.QueryRoleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removePolicyStatementsFromRole(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.identity.role.api.RemovePolicyStatementsFromRoleAction.class) Closure c) {
        def a = new org.zstack.sdk.identity.role.api.RemovePolicyStatementsFromRoleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateRole(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.identity.role.api.UpdateRoleAction.class) Closure c) {
        def a = new org.zstack.sdk.identity.role.api.UpdateRoleAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeSNSApplicationEndpointState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.ChangeSNSApplicationEndpointStateAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.ChangeSNSApplicationEndpointStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeSNSApplicationPlatformState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.ChangeSNSApplicationPlatformStateAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.ChangeSNSApplicationPlatformStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeSNSTopicState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.ChangeSNSTopicStateAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.ChangeSNSTopicStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createSNSTopic(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.CreateSNSTopicAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.CreateSNSTopicAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteSNSApplicationEndpoint(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.DeleteSNSApplicationEndpointAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.DeleteSNSApplicationEndpointAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteSNSApplicationPlatform(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.DeleteSNSApplicationPlatformAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.DeleteSNSApplicationPlatformAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteSNSTopic(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.DeleteSNSTopicAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.DeleteSNSTopicAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySNSApplicationEndpoint(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.QuerySNSApplicationEndpointAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.QuerySNSApplicationEndpointAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySNSApplicationPlatform(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.QuerySNSApplicationPlatformAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.QuerySNSApplicationPlatformAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySNSTopic(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.QuerySNSTopicAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.QuerySNSTopicAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySNSTopicSubscriber(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.QuerySNSTopicSubscriberAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.QuerySNSTopicSubscriberAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def subscribeSNSTopic(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.SubscribeSNSTopicAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.SubscribeSNSTopicAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def unsubscribeSNSTopic(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.UnsubscribeSNSTopicAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.UnsubscribeSNSTopicAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateSNSApplicationEndpoint(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.UpdateSNSApplicationEndpointAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.UpdateSNSApplicationEndpointAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateSNSApplicationPlatform(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.UpdateSNSApplicationPlatformAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.UpdateSNSApplicationPlatformAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateSNSTopic(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.UpdateSNSTopicAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.UpdateSNSTopicAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addSNSDingTalkAtPerson(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.platform.dingtalk.AddSNSDingTalkAtPersonAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.platform.dingtalk.AddSNSDingTalkAtPersonAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createSNSDingTalkEndpoint(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.platform.dingtalk.CreateSNSDingTalkEndpointAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.platform.dingtalk.CreateSNSDingTalkEndpointAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySNSDingTalkEndpoint(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.platform.dingtalk.QuerySNSDingTalkEndpointAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.platform.dingtalk.QuerySNSDingTalkEndpointAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeSNSDingTalkAtPerson(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.platform.dingtalk.RemoveSNSDingTalkAtPersonAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.platform.dingtalk.RemoveSNSDingTalkAtPersonAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createSNSEmailEndpoint(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.platform.email.CreateSNSEmailEndpointAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.platform.email.CreateSNSEmailEndpointAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createSNSEmailPlatform(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.platform.email.CreateSNSEmailPlatformAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.platform.email.CreateSNSEmailPlatformAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySNSEmailEndpoint(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.platform.email.QuerySNSEmailEndpointAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.platform.email.QuerySNSEmailEndpointAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySNSEmailPlatform(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.platform.email.QuerySNSEmailPlatformAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.platform.email.QuerySNSEmailPlatformAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def validateSNSEmailPlatform(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.platform.email.ValidateSNSEmailPlatformAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.platform.email.ValidateSNSEmailPlatformAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createSNSHttpEndpoint(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.platform.http.CreateSNSHttpEndpointAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.platform.http.CreateSNSHttpEndpointAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySNSHttpEndpoint(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.sns.platform.http.QuerySNSHttpEndpointAction.class) Closure c) {
        def a = new org.zstack.sdk.sns.platform.http.QuerySNSHttpEndpointAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeTicketFlowCollectionState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.api.ChangeTicketFlowCollectionStateAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.api.ChangeTicketFlowCollectionStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeTicketStatus(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.api.ChangeTicketStatusAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.api.ChangeTicketStatusAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createTicket(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.api.CreateTicketAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.api.CreateTicketAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteTicket(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.api.DeleteTicketAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.api.DeleteTicketAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteTicketFlowCollection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.api.DeleteTicketFlowCollectionAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.api.DeleteTicketFlowCollectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryArchiveTicket(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.api.QueryArchiveTicketAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.api.QueryArchiveTicketAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryArchiveTicketHistory(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.api.QueryArchiveTicketHistoryAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.api.QueryArchiveTicketHistoryAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryTicket(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.api.QueryTicketAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.api.QueryTicketAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryTicketFlow(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.api.QueryTicketFlowAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.api.QueryTicketFlowAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryTicketFlowCollection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.api.QueryTicketFlowCollectionAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.api.QueryTicketFlowCollectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryTicketHistory(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.api.QueryTicketHistoryAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.api.QueryTicketHistoryAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateTicketRequest(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.api.UpdateTicketRequestAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.api.UpdateTicketRequestAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addIAM2TicketFlow(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.iam2.api.AddIAM2TicketFlowAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.iam2.api.AddIAM2TicketFlowAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createIAM2TickFlowCollection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.iam2.api.CreateIAM2TickFlowCollectionAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.iam2.api.CreateIAM2TickFlowCollectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteIAM2TicketFlow(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.iam2.api.DeleteIAM2TicketFlowAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.iam2.api.DeleteIAM2TicketFlowAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateIAM2TicketFlow(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.iam2.api.UpdateIAM2TicketFlowAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.iam2.api.UpdateIAM2TicketFlowAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateIAM2TicketFlowCollection(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.ticket.iam2.api.UpdateIAM2TicketFlowCollectionAction.class) Closure c) {
        def a = new org.zstack.sdk.ticket.iam2.api.UpdateIAM2TicketFlowCollectionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addToAlarmAction(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.AddActionToAlarmAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.AddActionToAlarmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addToEventSubscriptionAction(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.AddActionToEventSubscriptionAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.AddActionToEventSubscriptionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addLabelToAlarm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.AddLabelToAlarmAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.AddLabelToAlarmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def addLabelToEventSubscription(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.AddLabelToEventSubscriptionAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.AddLabelToEventSubscriptionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def changeAlarmState(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.ChangeAlarmStateAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.ChangeAlarmStateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createAlarm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.CreateAlarmAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.CreateAlarmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteAlarm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.DeleteAlarmAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.DeleteAlarmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryAlarm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.QueryAlarmAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.QueryAlarmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def queryEventSubscription(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.QueryEventSubscriptionAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.QueryEventSubscriptionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeFromAlarmAction(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.RemoveActionFromAlarmAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.RemoveActionFromAlarmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeFromEventSubscriptionAction(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.RemoveActionFromEventSubscriptionAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.RemoveActionFromEventSubscriptionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeLabelFromAlarm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.RemoveLabelFromAlarmAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.RemoveLabelFromAlarmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def removeLabelFromEventSubscription(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.RemoveLabelFromEventSubscriptionAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.RemoveLabelFromEventSubscriptionAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def subscribeEvent(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.SubscribeEventAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.SubscribeEventAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def unsubscribeEvent(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.UnsubscribeEventAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.UnsubscribeEventAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAlarm(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.UpdateAlarmAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.UpdateAlarmAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAlarmLabel(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.UpdateAlarmLabelAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.UpdateAlarmLabelAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def createSNSTextTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.sns.CreateSNSTextTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.sns.CreateSNSTextTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteSNSTextTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.sns.DeleteSNSTextTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.sns.DeleteSNSTextTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def querySNSTextTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.sns.QuerySNSTextTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.sns.QuerySNSTextTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        
        a.conditions = a.conditions.collect { it.toString() }


        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateSNSTextTemplate(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.alarm.sns.UpdateSNSTextTemplateAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.alarm.sns.UpdateSNSTextTemplateAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def deleteMetricData(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.api.DeleteMetricDataAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.api.DeleteMetricDataAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getAlarmData(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.api.GetAlarmDataAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.api.GetAlarmDataAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getAllEventMetadata(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.api.GetAllEventMetadataAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.api.GetAllEventMetadataAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getAllMetricMetadata(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.api.GetAllMetricMetadataAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.api.GetAllMetricMetadataAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getAuditData(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.api.GetAuditDataAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.api.GetAuditDataAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getEventData(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.api.GetEventDataAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.api.GetEventDataAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getMetricData(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.api.GetMetricDataAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.api.GetMetricDataAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def getMetricLabelValue(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.api.GetMetricLabelValueAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.api.GetMetricLabelValueAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def putMetricData(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.api.PutMetricDataAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.api.PutMetricDataAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateAlarmData(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.api.UpdateAlarmDataAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.api.UpdateAlarmDataAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


    def updateEventData(@DelegatesTo(strategy = Closure.OWNER_FIRST, value = org.zstack.sdk.zwatch.api.UpdateEventDataAction.class) Closure c) {
        def a = new org.zstack.sdk.zwatch.api.UpdateEventDataAction()
        a.sessionId = Test.currentEnvSpec?.session?.uuid
        c.resolveStrategy = Closure.OWNER_FIRST
        c.delegate = a
        c()
        

        if (System.getProperty("apipath") != null) {
            if (a.apiId == null) {
                a.apiId = Platform.uuid
            }
    
            def tracker = new ApiPathTracker(a.apiId)
            def out = errorOut(a.call())
            def path = tracker.getApiPath()
            if (!path.isEmpty()) {
                Test.apiPaths[a.class.name] = path.join(" --->\n")
            }
        
            return out
        } else {
            return errorOut(a.call())
        }
    }


}
