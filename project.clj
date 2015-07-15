(defproject port-record "0.0.1"
  :description "Provides a set of ports and tests."
  :url "http://quipucamayoc.com/"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "0.0-3308"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]]

  :node-dependencies [[source-map-support "0.3.2"]
                      [osc-min "0.2.0"]]

  :plugins [[lein-cljsbuild "1.0.6"]
            [lein-ancient "0.6.7"]
            [lein-cljfmt "0.2.0"]
            [lein-marginalia "0.8.0"]
            [lein-npm "0.5.0"]]

  :source-paths ["src"]

  :main "run/dash.js"

  :clean-targets ["run/out" "run/dash.js" "run/dash.js.map"]

  :cljsbuild {
              :builds [{:id           "core"
                        :source-paths ["src"]
                        :compiler     {:source-map    "run/dash.js.map"
                                       :output-to     "run/dash.js"
                                       :output-dir    "run/out"
                                       :target        :nodejs
                                       :optimizations :none
                                       :main          dashboard.display
                                       :pretty-print  true}}]})
