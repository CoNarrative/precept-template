(ns ^:figwheel-no-load precept.todomvc.app
  (:require [precept.todomvc.core :as core]
            [figwheel.client :as figwheel :include-macros true]))

(figwheel/watch-and-reload
  :on-jsload #'core/mount-components)

(core/main)
