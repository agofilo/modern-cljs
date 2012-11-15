(defproject modern-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  ; CLJ source code path
  :source-paths ["src/clj"]
  :dependencies [[org.clojure/clojure "1.4.0"]]
  ; lein-cljsbuild plugin to build a CLJS project
  :plugins [[lein-cljsbuild "0.2.9"]]
  ; cljsbuild options configuration
  :cljsbuild {:builds
              [{; CLJS source code path
                :source-path "src/cljs"
                ; Google Closure (CLS) options configuration
                :compiler {; CLS generated JS script filename
                           :output-to "resources/public/js/modern.js"
                           ; minimal JS optimization directive
                           :optimizations :whitespace
                           ; generated JS code prettyfication
                           :pretty-print true}}]})
