(ns tutorial.namespaces
  (:require [clojure.string :refer :all]))

(defn -main
  []
  (println "hello")
  (println (clojure.string/capitalize "hello"))
  (println (capitalize "hello")))


(-main)