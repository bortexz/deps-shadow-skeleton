(ns app
  (:require [shadow.cljs.devtools.api :as shadow]
            [shadow.cljs.devtools.server :as shadow-server]))

(shadow-server/start!)
(shadow/watch :app)