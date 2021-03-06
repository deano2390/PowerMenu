
/*
 * Copyright (C) 2018 skydoves
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.skydoves.powermenu;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;

@SuppressWarnings("WeakerAccess")
public abstract class AbstractMenuBuilder {

    protected Context context;
    protected LayoutInflater layoutInflater;
    
    protected boolean showBackground = true;
    protected LifecycleOwner lifecycleOwner = null;
    protected View.OnClickListener backgroundClickListener = null;
    protected OnDismissedListener onDismissedListener = null;
    protected MenuAnimation menuAnimation = MenuAnimation.DROP_DOWN;
    protected View headerView = null;
    protected View footerView = null;
    protected int animationStyle = -1;
    protected float menuRadius = 5;
    protected float menuShadow = 5;
    protected int width = 0;
    protected int height = 0;
    protected int dividerHeight = 0;
    protected Drawable divider = null;
    protected int backgroundColor = Color.BLACK;
    protected float backgroundAlpha = 0.6f;
    protected boolean focusable = false;
    protected int selected = -1;
    protected boolean isClipping = true;
    protected boolean autoDismiss = false;
}
