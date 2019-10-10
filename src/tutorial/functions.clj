(ns tutorial.functions
  (:gen-class))

(defn -main
  "First function"
  []
  (println "My name is John")
  (println "Clojure test")
  (+ 2 5))

(#(println "Hello" % ) "John")


(def increment (fn [x] (+ x 1 )))

(defn increment_set
  []
  (map increment [1,2,4]))

(defn increment_set_with_params
  [x]
  (map increment x))

(defn DataTypes []
  (def a 1)
  (def b 1.25)
  (def c 1.25e-12)
  (def d 0xfbfc)
  (def e nil)
  (def f true)
  (def g 'thanks)

  (def status true)
  (def STATUS false)

  (println a)
  (println b)
  (println c)
  (println d)
  (println e)
  (println f)
  (println g)
  (println status)
  (println STATUS)
  )

(DataTypes)