(ns tutorial.loops)

(defn Loop
  []
  (println "Loop:")
  (loop [x 0]
    (when (< x 10)
      (println x)
      (recur (inc x)))
    ))
(Loop)


(defn do_times
  []
  (println "Do Times:")
  (dotimes [x 10]
    (println x))
  )

(do_times)


(defn while_do
  [count]
  (println "While do:")
  (def x (atom 0))
  (while (< @x count)
    (do
      (println @x)
      (swap! x inc)))
  )

(while_do 10)

(defn do_seq
  [seq]
  (println "While do:")
  (doseq [x seq]
    (println (inc x)))
  )

(do_seq [1 2 3 4 5])