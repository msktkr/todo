(ns todo-clj.db
  (:require [clojure.java.jdbc :as jdbc]))

(def db-spec
  {:dbtype "postgresql"
   :dbname "todo_clj_dev"
   :hsot "localhost"
   :port 5432
   :user "postgres"
   :password "hogehoge"})

(defn migrate []
  (jdbc/db-do-commands
   db-spec
   (jdbc/create-table-ddl :todo [:id :serial] [:title :varchar])))
