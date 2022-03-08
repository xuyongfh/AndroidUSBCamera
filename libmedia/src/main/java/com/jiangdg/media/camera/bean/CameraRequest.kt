/*
 * Copyright 2017-2022 Jiangdg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jiangdg.media.camera.bean


/** Camera request parameters
 *
 * @author Created by jiangdg on 2021/12/20
 */
class CameraRequest private constructor() {
    var previewWidth: Int = DEFAULT_WIDTH
    var previewHeight: Int = DEFAULT_HEIGHT
    var cameraId: String = ""
    var isFrontCamera: Boolean = false
    var isContinuousAFModel: Boolean = true
        private set
    var isContinuousAEModel: Boolean = true
        private set


    /**
     * Camera request builder
     *
     * @constructor Create empty Camera request builder
     */
    class CameraRequestBuilder {
        private val mRequest by lazy {
            CameraRequest()
        }

        /**
         * Set preview width
         *
         * @param width camera preview width
         * @return see [CameraRequestBuilder]
         */
        fun setPreviewWidth(width: Int): CameraRequestBuilder {
            mRequest.previewWidth = width
            return this
        }

        /**
         * Set preview height
         *
         * @param height camera preview height
         * @return [CameraRequestBuilder]
         */
        fun setPreviewHeight(height: Int): CameraRequestBuilder {
            mRequest.previewHeight = height
            return this
        }

        /**
         * Set camera id
         *
         * @param cameraId camera id
         * @return [CameraRequestBuilder]
         */
        fun setCameraId(cameraId: String): CameraRequestBuilder {
            mRequest.cameraId = cameraId
            return this
        }

        /**
         * Set front camera
         *
         * @param isFrontCamera front camera flag
         * @return [CameraRequestBuilder]
         */
        fun setFrontCamera(isFrontCamera: Boolean): CameraRequestBuilder {
            mRequest.isFrontCamera = isFrontCamera
            return this
        }

        /**
         * Set continuous a f model
         *
         * @param isContinuousAF
         * @return [CameraRequestBuilder]
         */
        fun setContinuousAFModel(isContinuousAF: Boolean): CameraRequestBuilder {
            mRequest.isContinuousAFModel = isContinuousAF
            return this
        }

        /**
         * Set continuous auto model
         *
         * @param isContinuousAuto
         * @return [CameraRequestBuilder]
         */
        fun setContinuousAutoModel(isContinuousAuto: Boolean): CameraRequestBuilder {
            mRequest.isContinuousAEModel = isContinuousAuto
            return this
        }

        /**
         * Create a CameraRequest
         *
         * @return [CameraRequest]
         */
        fun create(): CameraRequest {
            return mRequest
        }
    }

    override fun toString(): String {
        return "CameraRequest(previewWidth=$previewWidth, previewHeight=$previewHeight, " +
                "cameraId='$cameraId', isFrontCamera=$isFrontCamera, " +
                "isContinuousAFModel=$isContinuousAFModel, isContinuousAEModel=$isContinuousAEModel)"
    }

    companion object {
        private const val DEFAULT_WIDTH = 640
        private const val DEFAULT_HEIGHT = 480
    }
}