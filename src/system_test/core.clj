(ns system-test.core)

(defn greeter [name]
  (str "Hello " name "!"))

(defn app [greeter name]
  (greeter name))

(defn system
  "Returns a new instace of the whole application"
  [name]
  {:greeter greeter
   :name name
   :app app}
)

(defn start
  "Performs side effects to initialize the system, acquire resources,
  and start it running. Returns an updated instance of the system."
  [system]
  (println "Start the greeter")
  (let [greeter (:greeter system)
        name (:name system)]
    (app greeter name)))

(defn stop
  "Performs side effects to shut down the system and release its
  resources. Returns an updated instance of the system."
  [system]
  (println "Stopping for now"))
