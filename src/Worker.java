public class Worker {
    OnTaskDoneListener callback;
    OnTaskErrorListener errorCallback;
    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
        this.callback = callback;
    }

    public void start(){
        for (int i = 0; i < 100; i++) {
            if (i == 33) errorCallback.onError("Error in task " + i);
            else callback.onDone("Task " + i + " is done!");
        }
    }
}
