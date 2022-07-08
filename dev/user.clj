(ns user
  (:require [shadow.cljs.devtools.api :as shadow]
            [shadow.cljs.devtools.server :as shadow-server]))

(defn start-cljs []
  (shadow-server/start!)
  (shadow/watch :app))
