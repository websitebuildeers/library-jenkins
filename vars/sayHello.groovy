def call(Map config = [:]) {
    def name   = config.name   ?: 'Student'
    def course = config.course ?: 'DevOps'
    def batch  = config.batch  ?: 'Oct-2026'
    echo "Hello ${name}, welcome to ${course} (Batch: ${batch})"
}
