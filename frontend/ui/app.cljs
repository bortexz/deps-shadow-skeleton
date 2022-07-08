(ns ui.app
  (:require [reagent.dom :as rdom]))

(defn view 
  []
  [:span "Hello World"])

(defn init []
  (println "Hello World")
  (rdom/render [#'view] (.getElementById js/document "app")))
