(ns tutorial.conditionals)


(defn if_cond
  []
  (println "If conditional:")
  (if (= 5 6)
    (println "Equal")
    (println "Not Equal")
    ))
(if_cond)


(defn if_con_do
  []
  (println "If conditional do:")
  (if ( = 5 6)
    (do (println "First statement")
        (println "Second statement"))
    (do (println "Not equal first statement")
        (println "Second statement "))
    ))
(if_con_do)


(defn cond_nested_if
  []
  (println "If nested:")
  (if (and (+ 5 5) (or (= 2 2) (not true)))
    (println "True")
    (println "False")
  ))

(cond_nested_if)

(defn cond_case
  [pet]
  (println "Conditional case")
  (case pet
    "cat" (println "Is a cat")
    "dog" (println "Is a dog")
    "fish" (println "Is a fish")))
(cond_case "dog")

(defn cond_cond
  [amount]
  (cond
    (<= amount 2) (println "Few")
    (<= amount 20) (println "Several")
    (<= amount 100) (println "Many")
    :else (println "Loads")
    ))

(cond_cond 5)
(cond_cond 102)