(ns blogapi.core
  (:gen-class)
  (:require [ring.adapter.jetty :refer [run-jetty]]))

(defn handler [request]
  {:status 200
   :headers {"content-type" "text/plain"}
   :body "suh?"})

(defonce server
  (delay
    (run-jetty #'handler {:port 3000
                          :join? false})))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
