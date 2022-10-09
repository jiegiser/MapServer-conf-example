import ImageWMS from 'ol/source/ImageWMS';
import Map from 'ol/Map';
import OSM from 'ol/source/OSM';
import View from 'ol/View';
import {Image as ImageLayer, Tile as TileLayer} from 'ol/layer';

const layers = [
  new TileLayer({
    source: new OSM(),
  }),
  // shp layer
  new ImageLayer({
    // extent: [-13884991, 2870341, -7455066, 6338219],
    source: new ImageWMS({
      url: 'http://localhost/cgi-bin/mapserv.exe?map=/ms4w/apps/cgi-viewer/map/sample.map',
      params: {
        'LAYERS': ['road'],
      },
      serverType: 'mapserver',
    }),
  }),
  /*
  // raster layer
  new ImageLayer({
    // extent: [-13884991, 2870341, -7455066, 6338219],
    source: new ImageWMS({
      url: 'http://localhost/cgi-bin/mapserv.exe?map=/ms4w/apps/cgi-viewer/map/raster.map',
      params: {
        'LAYERS': ['bathymetry'],
      },
      serverType: 'mapserver',
    }),
  }),
  */
  
  // label layer
  new ImageLayer({
    // extent: [-13884991, 2870341, -7455066, 6338219],
    source: new ImageWMS({
      url: 'http://localhost/cgi-bin/mapserv.exe?map=/ms4w/apps/cgi-viewer/map/label.map',
      params: {
        'LAYERS': ['label'],
      },
      serverType: 'mapserver',
    }),
  }),
  
];
new Map({
  layers: layers,
  target: 'map',
  view: new View({
    center: [-98.90, 51.56],
    zoom: 4,
    projection: "EPSG:4326"
  }),
});
