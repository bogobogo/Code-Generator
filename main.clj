(def params (range 100))
(def ops `(+ - * /))
(defmacro rand-prm [] (rand-nth params))
(defmacro rand-op [] (rand-nth ops))

(defn simple-code-generator []
  "a very simple code generator"
  `(fn [~'param] ((rand-op) ~'param ~(rand-prm)))
)

(defn generate-test []
  `(fn [~'code] (= (~'code ~(rand-prm)) ~(rand-prm))))

;; (defn find-working-code [test])

;; (defn run-test [] )
;; (def example-test (generate-test))
(def sometest (generate-test))
sometest
(def somecode (simple-code-generator))
somecode
(eval (list sometest somecode))

(defn tree-code-generator []
  "random recursive code generator with math ops and random numbers"
  (def add 
  (defn generateExpression [depth length ops params] 
    
    )
  
)

(defn train-correct-addition
  "The code above was a demonstration of generating code randomly. 
    The code below aims to be the code that will be used to make the code generator not
    random. We will start with a simple task: find the correct number to add so that a test 
    will pass. How would we teach a human to do that?"
 [] 
)