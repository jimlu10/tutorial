(ns tutorial.agents)


(defn Agent
  []
  (def amount (agent 100))
  (println @amount)

  (send amount inc)
  (println @amount)
  (println "Time pass")
  (println @amount)

  (send amount inc)
  (await-for 1000 amount)
  (println @amount)

  (println (agent-error amount))
  )

(Agent)