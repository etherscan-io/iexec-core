package com.iexec.core.task;

public enum TaskStatus {
    RECEIVED,
    INITIALIZED,
    INITIALIZE_FAILED,
    RUNNING,
    CONSENSUS_REACHED,
    AT_LEAST_ONE_REVEALED,
    REVEALED,
    RESULT_UPLOAD_REQUESTED,
    RESULT_UPLOADING,
    RESULT_UPLOADED,
    FINALIZING,
    FINALIZED,
    FINALIZE_FAILED,
    COMPLETED,
    ERROR;

}
