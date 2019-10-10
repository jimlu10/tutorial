(ns tutorial.macros)

(macroexpand-1 '(when true (println "Hello")))

;(macroexpand-1 '(when true (println "Hello")))