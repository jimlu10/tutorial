(ns tutorial.destructuring)

(defn destruct
  []
  (def my_vect [1 2 3 4])
  (let [[ a b c] my_vect] (println a b c))
  (let [[ a b & rest] my_vect] (println a b rest))

  (def my_map { 'name "John" 'lastname "Smith" })
  (let [{ a 'name b 'lastname } my_map] (println a b))
  (let [{ a 'name b 'lastname c 'noname} my_map] (println a b c))
  )
(destruct)