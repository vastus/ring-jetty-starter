(defproject ring-jetty-starter "0.1.0-SNAPSHOT"
  :description "Minimalist starter pack for a ring app"
  :url "https://github.com/vastus/ring-jetty-starter"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [ring/ring-core "1.6.3"]]
  :main ^:skip-aot ring-jetty-starter.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
