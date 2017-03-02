package com.lakeel.altla.vision.builder.presentation.view;

import com.google.atap.tango.ux.TangoUx;

import com.lakeel.altla.vision.builder.presentation.model.Axis;

import org.rajawali3d.renderer.ISurfaceRenderer;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

/**
 * Defines the main view.
 */
public interface UserSceneBuildView {

    void setTangoUxLayout(TangoUx tangoUx);

    void setSurfaceRenderer(ISurfaceRenderer renderer);

    void onUpdateObjectMenuVisible(boolean visible);

    void onUpdateTranslateSelected(boolean selected);

    void onUpdateTranslateMenuVisible(boolean visible);

    void onUpdateTranslateAxisSelected(Axis axis, boolean selected);

    void onUpdateRotateSelected(boolean selected);

    void onUpdateRotateMenuVisible(boolean visible);

    void onUpdateRotateAxisSelected(Axis axis, boolean selected);

    void onUpdateScaleSelected(boolean selected);

    void onUpdateDebugConsoleVisible(boolean visible);

    void onShowUserActorView(@NonNull String sceneId, @NonNull String actorId);

    void onCloseView();

    void onSnackbar(@StringRes int resId);
}
