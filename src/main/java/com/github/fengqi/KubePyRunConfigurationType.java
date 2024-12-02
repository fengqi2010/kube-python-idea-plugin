// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.github.fengqi;

import com.intellij.execution.configurations.ConfigurationTypeBase;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.util.NotNullLazyValue;

final class KubePyRunConfigurationType extends ConfigurationTypeBase {

  static final String ID = "KubePyRunConfiguration";

  KubePyRunConfigurationType() {
    super(ID, "Kube Python Debug", "Kube python run configuration type",
        NotNullLazyValue.createValue(() -> AllIcons.Nodes.Console));
    addFactory(new KubePyConfigurationFactory(this));
  }

}
