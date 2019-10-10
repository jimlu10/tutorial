(ns tutorial.watchers)

(defn watch
  []
  (def x (atom 5))
  (add-watch x :x_watcher
             (fn [key atom old_state new_state]
               (println key)
               (println atom)
               (println old_state)
               (println new_state)
             ))

  (reset! x 10)
  (remove-watch x :x_watcher)
  (reset! x 15)
)
(watch)
