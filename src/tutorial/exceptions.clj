(ns tutorial.exceptions)

(defn ex_handling
  [x]
  (try
    (inc x)
    (catch ClassCastException e (println "Caught Exception: " (.getMessage e)))
    (catch Exception e (println "Caught generic exception"))
    (finally (println "Cleanup and move on")))
  )

(ex_handling "Ulises")