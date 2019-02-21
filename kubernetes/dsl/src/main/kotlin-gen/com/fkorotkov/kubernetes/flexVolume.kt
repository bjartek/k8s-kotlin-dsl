// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.FlexPersistentVolumeSource
import io.fabric8.kubernetes.api.model.FlexVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`flexVolume`(block: FlexPersistentVolumeSource.() -> Unit = {}) {
  if(this.`flexVolume` == null) {
    this.`flexVolume` = FlexPersistentVolumeSource()
  }

  this.`flexVolume`.block()
}


fun  Volume.`flexVolume`(block: FlexVolumeSource.() -> Unit = {}) {
  if(this.`flexVolume` == null) {
    this.`flexVolume` = FlexVolumeSource()
  }

  this.`flexVolume`.block()
}

