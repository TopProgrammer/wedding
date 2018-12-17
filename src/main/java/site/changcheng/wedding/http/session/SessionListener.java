/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package site.changcheng.wedding.http.session;

import java.util.EventListener;

public interface SessionListener extends EventListener {
  public void fire(SessionEvent event);
}

