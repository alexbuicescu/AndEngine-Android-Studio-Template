package com.makeinfo.andenginetemplate;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.FillResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.ui.activity.SimpleBaseGameActivity;


public class MainActivity extends SimpleBaseGameActivity {

    private Camera camera;
    private static final int CAMERA_WIDTH = 800;
    private static final int CAMERA_HEIGHT = 480;

    @Override
    protected void onCreateResources() {
        
    }

    @Override
    protected Scene onCreateScene() {
        Scene scene = new Scene();
        scene.setBackground(new Background(0.09804f, 0.6274f, 0.8784f));
        return scene;
    }

    @Override
    public EngineOptions onCreateEngineOptions() {
        camera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
        EngineOptions engineOptions = new EngineOptions(true, ScreenOrientation.LANDSCAPE_FIXED,
                new FillResolutionPolicy(), camera);
        return engineOptions;
    }
}
