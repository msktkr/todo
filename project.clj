(defproject todo-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring "1.9.5"]
                 [compojure "1.7.0"]
                 [environ "1.0.1"]]
  :plugins [[lein-environ "1.0.1"]]
  :repl-options {:init-ns todo-clj.core}
  :profiles
  {:dev {:dependencies [[prone "0.8.2"]]
         :env {:dev true}}}
  {:repl {:dependencies [[alembic "0.3.2"]]}})
