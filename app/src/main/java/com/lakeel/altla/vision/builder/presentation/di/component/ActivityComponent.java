package com.lakeel.altla.vision.builder.presentation.di.component;

import com.lakeel.altla.vision.builder.presentation.di.ActivityScope;
import com.lakeel.altla.vision.builder.presentation.di.module.ActivityModule;
import com.lakeel.altla.vision.builder.presentation.di.module.GoogleApiModule;
import com.lakeel.altla.vision.builder.presentation.view.activity.MainActivity;
import com.lakeel.altla.vision.builder.presentation.view.fragment.ArFragment;
import com.lakeel.altla.vision.builder.presentation.view.fragment.AreaByPlaceListFragment;
import com.lakeel.altla.vision.builder.presentation.view.fragment.AreaDescriptionByAreaListFragment;
import com.lakeel.altla.vision.builder.presentation.view.fragment.AreaFindFragment;
import com.lakeel.altla.vision.builder.presentation.view.fragment.AreaModeFragment;
import com.lakeel.altla.vision.builder.presentation.view.fragment.AreaSettingsContainerFragment;
import com.lakeel.altla.vision.builder.presentation.view.fragment.AreaSettingsFragment;
import com.lakeel.altla.vision.builder.presentation.view.fragment.DebugConsoleFragment;
import com.lakeel.altla.vision.builder.presentation.view.fragment.SignInFragment;
import com.lakeel.altla.vision.builder.presentation.view.fragment.TangoPermissionFragment;
import com.lakeel.altla.vision.builder.presentation.view.fragment.UserActorEditFragment;
import com.lakeel.altla.vision.builder.presentation.view.fragment.UserActorFragment;
import com.lakeel.altla.vision.builder.presentation.view.fragment.UserImageAssetListFragment;

import dagger.Subcomponent;

/**
 * Defines the dagger component that manages objects per activity.
 */
@ActivityScope
@Subcomponent(modules = { ActivityModule.class,
                          GoogleApiModule.class })
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(SignInFragment fragment);

    void inject(TangoPermissionFragment fragment);

    void inject(AreaByPlaceListFragment fragment);

    void inject(AreaDescriptionByAreaListFragment fragment);

    void inject(ArFragment fragment);

    void inject(AreaSettingsContainerFragment fragment);

    void inject(AreaSettingsFragment fragment);

    void inject(AreaModeFragment fragment);

    void inject(AreaFindFragment fragment);

    void inject(UserImageAssetListFragment fragment);

    void inject(UserActorFragment fragment);

    void inject(UserActorEditFragment fragment);

    void inject(DebugConsoleFragment fragment);
}
